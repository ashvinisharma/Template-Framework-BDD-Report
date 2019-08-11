package com.restasured.api.customer_reg;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.restasured.api.common.CommonHelperClass;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class TestPostAPI {

	public String[] userCreate  = {"APIUserTest1","JobName"};
	static RequestSpecification requestSpec; 

    @BeforeAll
	public  static void requestSpecification() {
    	requestSpec=CommonHelperClass.requestSpecs();
    }  
	
	
	@Test
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
