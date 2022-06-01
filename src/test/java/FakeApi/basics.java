package FakeApi;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import FeatureFile.Reusablemethod;
import File.payload;
import cucumber.api.java.en.Given;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://rahulshettyacademy.com";
//	given().log().all().queryParam("key", "qaclick123 ").header("Content-Type", "application/json")
//	.body(payload.addplace()).when().post("maps/api/place/add/json")
//		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
//		.header("Server", "Apache/2.4.18 (Ubuntu)").body("status", equalTo("OK"));
	
// Add place > update place with new address > get place to validate if New address is present in response  
// If we want to extract data (response) and want to store into string 
	String Response= given().log().all().queryParam("key", "qaclick123 ").header("Content-Type", "application/json")
	.body(payload.addplace()).when().post("maps/api/place/add/json")
	.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
	.header("Server", "Apache/2.4.18 (Ubuntu)").body("status", equalTo("OK")).extract().response().asString();
	
	//I have removed Log().all() in response so it will not log the response it will only log the request
	System.out.println("Our Add place response is : "+ Response);
	JsonPath js=new JsonPath(Response);
	String placeid=js.getString("place_id");
	System.out.println(placeid);
	
	//Update place 
//	given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
//	.body("{ \r\n"
//			+ "\r\n"
//			+ "\"place_id\":\""+placeid+"\", \r\n"
//			+ "\r\n"
//			+ "\"address\":\"29, side layout, cohen 09\", \r\n"
//			+ "\r\n"
//			+ "\"key\":\"qaclick123\" \r\n"
//			+ "\r\n"
//			+ "} ")
//	.when().put("maps/api/place/update/json")
//	.then().log().all().assertThat().statusCode(200);
	
	
	
	//Get Place And verify the addresss
	String address= "29, side layout, cohen 09";
	String address1=given().log().all().queryParam("place_id",placeid).queryParam("key", "qaclick123")
	.when().get("maps/api/place/get/json")
	.then().log().all().assertThat().statusCode(200).body("types", equalTo("shoe park,shop")).extract().response().asString();
	
	JsonPath js1=Reusablemethod.rawtojson(address1);
	String actualaddress=js.getString("address");
	String language=js1.getString("language");
	System.out.println(actualaddress+ "**************");
	System.out.println(language+ "**************");
	
	// We have inbult Rest assured method for assersion which comes un then() if we want to use assersion outside of given when then then we need to use 
	// So for this we need to relay on testing framework to use assersion method bcz java does not have any assersion method
	// two testing framework is popular in java is junit/testng 
	Assert.assertEquals(actualaddress, address);

	
	}

	
}
