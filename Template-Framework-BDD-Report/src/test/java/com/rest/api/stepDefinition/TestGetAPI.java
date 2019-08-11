package com.rest.api.stepDefinition;

import io.restassured.specification.RequestSpecification;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.hamcrest.Matchers.equalTo;
import com.rest.api.common.*;
import static io.restassured.RestAssured.given;

/**
 * @author ashv
 *
 */

public class TestGetAPI {

	static RequestSpecification requestSpec; 

	@Given("^Get API URL")
	public  static void requestSpecification() {
    	requestSpec=CommonHelperClass.requestSpecs();
    }  
	
	@Then("^Test Get API")
	public void testCustomerRegAPIsingleAllUser() {
		given().
        	spec(requestSpec).
		when().
			get("/api/users/2").
		then().
			assertThat().
			statusCode(200).
			body("data.first_name", equalTo("Janet"));
	}

}
