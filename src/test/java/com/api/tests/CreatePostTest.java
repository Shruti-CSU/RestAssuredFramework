package com.api.tests;

import com.api.base.BaseTest;
import com.api.constants.EndPoints;
import com.api.dataproviders.PostDataProvider;
import com.api.models.Posts;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreatePostTest extends BaseTest {

    @Test(dataProvider = "PostUserData", dataProviderClass = PostDataProvider.class)
    public void createPostTest(Posts post, int expectedStatus) {

        Response response = given()
                .header("Content-Type", "application/json")
                .body(post)
                .when()
                .post(EndPoints.Post);

        Assert.assertEquals(response.getStatusCode(), expectedStatus);

    }
    @Test(dataProvider = "PostUserData", dataProviderClass = PostDataProvider.class)
    public void cratepostinvalidURLTest(Posts post, int expectedStatus) {

        Response response = given()
                .header("Content-Type", "application/json")
                .body(post)
                .when()
                .post("/post");

        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
