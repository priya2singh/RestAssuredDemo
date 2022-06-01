package FakeApi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FeatureFile.Reusablemethod;
import File.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Dynamicjson {
	

//	@Test
//	public void addbook() {
//		
//	RestAssured.baseURI="http://216.10.245.166";
//	String response=given().log().all().
//	header("Content-Type", "application/json")
//	.body(payload.addbook("abcs", "12345"))
//	.when().post("Library/Addbook.php")
//	.then().log().all().assertThat().statusCode(200).extract().response().asString();
//	
//	JsonPath js=Reusablemethod.rawtojson(response);
//	String id=js.getString("ID");
//	System.out.println(id);
//
//}
	
	@Test(dataProvider="Booksdata")
	public void addbook(String isbn, String aisle) {
		
	RestAssured.baseURI="http://216.10.245.166";
	String response=given().log().all().
	header("Content-Type", "application/json")
	.body(payload.addbook(isbn, aisle))
	.when().post("Library/Addbook.php")
	.then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	JsonPath js=Reusablemethod.rawtojson(response);
	String id=js.getString("ID");
	System.out.println(id);

}
	
	//Array= collection of elements
	//Multidimentional array= Collection of array
	
	@DataProvider(name="Booksdata")
	public Object[][] getData()
{	
		return new Object [][] {{"qrstk", "1267"},{"vfef","8543"},{"fddfe", "12355"}};
		}
}
