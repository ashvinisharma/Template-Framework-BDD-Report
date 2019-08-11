/**
 * Class file to Test GET API for Customer Registration Service
 */
package com.restasured.api.customer_reg;
import io.restassured.specification.RequestSpecification;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.restasured.api.common.*;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class TestGetAPI {

	static RequestSpecification requestSpec; 

    @BeforeAll
	public  static void requestSpecification() {
    	requestSpec=CommonHelperClass.requestSpecs();
    }  
	
	@Test
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
