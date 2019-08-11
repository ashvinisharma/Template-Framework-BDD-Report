package com.restasured.api.common;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


/*
 * This class can be used to create common specification of API.    
 */

public class CommonHelperClass {

	public static RequestSpecification requestSpec;
	
	public static RequestSpecification requestSpecs() {
		return requestSpec = new RequestSpecBuilder().setBaseUri("https://reqres.in").build();
	}
}
