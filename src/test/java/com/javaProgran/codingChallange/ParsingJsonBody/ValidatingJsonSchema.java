package com.javaProgran.codingChallange.ParsingJsonBody;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ValidatingJsonSchema {

	/*
	 * Response validation==>Validating data from response
	 * Schema Validation==>Validating type of data from response
	 * 
	 * Validating json schema using JsonSchemaValidator, In JsonSchemaValidator we are having method
	 * name as matchesJsonSchemaInClassPath("NAME OF JSON CLASS FILE")
	 */
	
	String responseInString="{\r\n" + 
			"  \"userId\": 1,\r\n" + 
			"  \"id\": 1,\r\n" + 
			"  \"title\": \"delectus aut autem\",\r\n" + 
			"  \"completed\": false\r\n" + 
			"}";
	//Approch 1
	@Test
	void validateResponseSchema()
	{
		given()
		.when()
		.get("https://localhost:8080/path")
		.then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonSchema.json"));
	}
	
	//Approch 2
	@Test
	void validateResponseSchemaApprochTwo()
	{
		Response response=given()
		.when()
		.get("https://localhost:8080/path");
		
		response.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonSchema.json"));
	}

}
