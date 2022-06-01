package Demo_api;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test_Post {

//	@Test
	public void Test_1_post()
	{
//		Map<String, Object> map= new HashMap<String, Object>();
//		map.put("name", "Priya");
//		map.put("Job", "Eng.");
//		map.put("framework", "Testng");
		
//		JSONObject request=new JSONObject(map);
		JSONObject request=new JSONObject();
		request.put("Name", "Priya singh");
		request.put("Job", "Teacher");
		System.out.println(request.toJSONString());
		given().
		body(request.toJSONString()).
		when().post("https://reqres.in/api/users").
		then().
		statusCode(201);
		
	}
	
//	@Test
	public void Test_1_Put() {
		JSONObject request=new JSONObject();
		request.put("Name", "Priya singh");
		request.put("Job", "Teacher");
		System.out.println(request.toJSONString());
		given().
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
//	@Test
	public void Test_1_Patch() {
		JSONObject request=new JSONObject();
		request.put("name", "Preeti singh");
		request.put("Job", "Teacher");
		System.out.println(request.toJSONString());
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().patch("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	@Test
	public void Test_1_Delete() {
		when().delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
	}
}
