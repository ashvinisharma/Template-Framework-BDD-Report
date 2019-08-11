package com.rest.api.stepDefinition;

import static io.restassured.RestAssured.given;
import com.rest.api.common.CommonHelperClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class TestDeleteAPI {

	static RequestSpecification requestSpec; 

    @When("^Del API URL")
	public  static void requestSpecification() {
    	requestSpec=CommonHelperClass.requestSpecs();
    }  

	@Then("^Test Del API")
	public void testDeleteUserAll() {
		given().
		spec(requestSpec).
		when().
			contentType(ContentType.JSON).
			delete("/api/users/2").
		then().
			statusCode(204);
	}
}
