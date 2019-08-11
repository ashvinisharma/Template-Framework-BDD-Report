package com.restasured.api.customer_reg;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.restasured.api.common.CommonHelperClass;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class TestDeleteAPI {

	static RequestSpecification requestSpec; 

    @BeforeAll
	public  static void requestSpecification() {
    	requestSpec=CommonHelperClass.requestSpecs();
    }  

	@Test
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
