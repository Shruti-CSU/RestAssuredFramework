package com.api.tests;

import com.api.base.BaseTest;
import com.api.constants.EndPoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class GetUserTest extends BaseTest {

    @Test
    public void getUserByID () {

        Response response = given()
                .when()
                .get(EndPoints.CREATE_USER);

        System.out.println(response.asString());

        //Validate Status code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Validate some response value
        int userId = response.jsonPath().getInt("[0].id");
        System.out.println("First user ID:" + userId);
    }

    @Test
    public void getUserByinvalidurl () {

        Response response = given()
                .when()
                .get("/user");

        System.out.println(response.asString());

        Assert.assertEquals(response.getStatusCode(), 404);
    }

}


