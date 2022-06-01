package Demo_api;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_Get {

	@Test
	public void test_01() {
		
		Response responce=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(responce.getBody().asString());
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getStatusLine());
		System.out.println(responce.getHeader("content-type"));
		System.out.println(responce.getTime());
		System.out.println("Api test case is created");
		System.out.println("header data is showing *****"+responce.getHeaders());
		
		int code=responce.statusCode();
		Assert.assertEquals(code, 200);
		System.out.println("**************");
		
	}
	
	@Test
	 void test_02() {
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.id[0]", equalTo(7));
		
	}

}
