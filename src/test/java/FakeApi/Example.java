package FakeApi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Example {

//	@Test
	public void test_get() {
		baseURI="http://localhost:3000/";
		given().
		param("fm", "Junit").
		get("/framework").
		then().
		statusCode(200).log().all();
	}
//	@Test
	public void test_post() {
		JSONObject request= new JSONObject();
		request.put("First_name", "preetu");
		request.put("Last_name", "singh");
		request.put("Subject_id", "55");
		baseURI="http://localhost:3000/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type", "application/json" ).
		body(request.toJSONString()).
		post("/framework").
		then().
		statusCode(201).log().all();
	}
	
//	@Test
	public void test_patch() {
		JSONObject request= new JSONObject();
		request.put("Last_name", "sharma");
		baseURI="http://localhost:3000/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type", "application/json" ).
		body(request.toJSONString()).
		patch("/framework/6").
		then().
		statusCode(200).log().all();
	}
	
	@Test
	public void test_put() {
		JSONObject request= new JSONObject();
		request.put("Last_name", "gupta");
		request.put("First_name", "preeta");
		baseURI="http://localhost:3000/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type", "application/json" ).
		body(request.toJSONString()).
		put("/framework/6").
		then().
		statusCode(200).log().all();
	}
	
	@Test
	public void test_Delete() {

		baseURI="http://localhost:3000/";
		given().
		delete("/framework/2").
		then().
		statusCode(200).log().all();
	}

}
