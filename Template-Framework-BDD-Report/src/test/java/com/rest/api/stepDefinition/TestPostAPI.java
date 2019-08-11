package com.rest.api.stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import com.rest.api.common.CommonHelperClass;

public class TestPostAPI {

	public String[] userCreate  = {"APIUserTest1","JobName"};
	static RequestSpecification requestSpec; 

    @When("^Post API URL")
	public  static void requestSpecification() {
    	requestSpec=CommonHelperClass.requestSpecs();
    }  
	
	
	@Then("^Test Post API")
	public void testCreateUniqueUserCheck() {	
		given().
			spec(requestSpec).
			contentType("application/json").
			accept("application/json").
			body(userCreate).
		when().
			post("/api/users");
	}

}
