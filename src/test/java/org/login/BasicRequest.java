package org.login;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicRequest {

	@Test
	private void tc01() {
		// create an object for request
		RestAssured.baseURI="https://reqres.in/";
		//to create for request object
		RequestSpecification requestSpecification = RestAssured.given();
		//to specify the query parameter
		requestSpecification.queryParam("page", "2");
		//To create the response object by mentoning the resource
		Response request = requestSpecification.request(Method.GET,"/api/users");
		//To print the response body
		String asstring= request.getBody().asPrettyString();
		System.out.println(asstring);
	}
}
