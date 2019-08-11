package com.rest.api.common;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class CommonHelperClass {

	public static RequestSpecification requestSpec;
	
	public static RequestSpecification requestSpecs() {
		return requestSpec = new RequestSpecBuilder().setBaseUri("https://reqres.in").build();
	}
}
