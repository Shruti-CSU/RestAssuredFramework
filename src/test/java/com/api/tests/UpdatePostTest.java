package com.api.tests;

import com.api.base.BaseTest;
import com.api.constants.EndPoints;
import com.api.dataproviders.PostDataProvider;
import com.api.models.UpdatePost;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdatePostTest extends BaseTest {

    @Test(dataProvider = "UpdatePostData", dataProviderClass = PostDataProvider.class)
    public void updateposttest(UpdatePost uppost, int expectedStatus) {

        Response response = given()
                .header("Content-Type", "application/json")
                .body(uppost)
                .when()
                .put(EndPoints.UpdatePost);

        Assert.assertEquals(response.getStatusCode(), expectedStatus);
    }

    @Test(dataProvider = "UpdatePostData", dataProviderClass = PostDataProvider.class)
    public void updatepostinvalidurl(UpdatePost putpost, int expectedStatus) {

        Response response = given()
                .header("Content-Type", "application/json")
                .body(putpost)
                .when()
                .put("/posts");

        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
