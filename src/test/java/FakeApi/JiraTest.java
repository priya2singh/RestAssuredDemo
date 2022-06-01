package FakeApi;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.io.File;

 class JiraTest {

	 public static void main(String [] args) {
		 
		 //Login Jira application
//		 RestAssured.baseURI="http://localhost:8080";
		 SessionFilter session=new SessionFilter();
		 String Response=given().header("Content-Type","application/json").body("{ \"username\": \"priya1156singh\", \"password\": \"Welcome@12345\" }")
			.when().log().all().filter(session).post("rest/auth/1/session")
			.then().log().all().statusCode(200).extract().response().asString();
		 
//			System.out.println("%%%%%"+Response);
//			
//			JsonPath js=new JsonPath(Response);
//			String value= js.getString("value");
//			String name=js.getString("name");
//			System.out.println(name+"**********"+ value);
			
			//creating an issue
//			String Response1= given().log().all().header("Cookie","JSESSIONID=239E85CA6883DA6C6F1A261A9B18FA11")
//			.body("{\r\n"
//					+ "    \"fields\": {\r\n"
//					+ "       \"project\":{\r\n"
//					+ "          \"key\": \"RES\"\r\n"
//					+ "       },\r\n"
//					+ "       \"summary\": \"Creating my second bug on jira \",\r\n"
//					+ "       \"description\": \"Creating my second bug\",\r\n"
//					+ "       \"issuetype\": {\r\n"
//					+ "          \"name\": \"Bug\"\r\n"
//					+ "       }\r\n"
//					+ "   }}")
//			.when().post("rest/api/2/issue")
//			.then().log().all().assertThat().statusCode(200).extract().response().asString();
//			JsonPath js1=new JsonPath(Response1);
//			int id=js1.get("id");
//			System.out.println("My id is equal to ="+ id);
			
		 //Add comments in issues
		 String expectedmessage="Hi how are you";
			String addcommentresponce=given().pathParam("id","10300").log().all().header("Content-Type", "application/json").body("{\r\n"
					+ "    \"body\": \""+expectedmessage+"\",\r\n"
					+ "    \"visibility\": {\r\n"
					+ "        \"type\": \"role\",\r\n"
					+ "        \"value\": \"Administrators\"\r\n"
					+ "    }\r\n"
					+ "}").
			filter(session).when().post("/rest/api/2/issue/{id}/comment")
			.then().log().all().statusCode(201).extract().response().asString();
			JsonPath js=new JsonPath(addcommentresponce);
			String commentid=js.getString("id");
			System.out.println(commentid);
	
			// Add Attachment
			//whenever we use the multiparth  method then header will automatically converted into multipart/form-data
//			given().header("X-Atlassian-Token","no-check")
//			.filter(session).pathParam("id","10300").
//			header("Content-Type","multipart/form-data").
//			multiPart("file", new File("jira.txt"))
//			.when().post("rest/api/2/issue/{id}/attachments")
//			.then().log().all().assertThat().statusCode(200);
			

			
			//Get the issue
//			String responce=given().log().all().filter(session).pathParam("id", "10300").
//			when().get("/rest/api/2/issue/{id}")
//			.then().log().all().extract().response().asString();
//			System.out.println("_________PRIYA SINGH_______"+responce);
			
			//if we want to get particluar comment or want to limit the responce then we will do 
			
			String responce=	given().log().all().filter(session).pathParam("id", "10300")
			.queryParam("fields", "comment").
			when().get("/rest/api/2/issue/{id}")
			.then().log().all().extract().response().asString();
			System.out.println("_________PRIYA SINGH_______"+responce);
			
			//Validate that the comment is showing as we have added 
			
			JsonPath js1=new JsonPath(responce);
			int id=js1.get("fields.comment.comments.size()");
			for(int i=0;i<=id;i++) {
				String allid=js1.getString("fields.comment.comments["+i+"].id");
				System.out.println("_______****ID IS****_______"+allid);
				
				if(allid.equalsIgnoreCase(commentid)) {
					String message=js1.get("fields.comment.comments["+i+"].body");
//					System.out.println("____BODY_____"+message);
					Assert.assertEquals(message, expectedmessage);
					System.out.println("____BODY_____"+message);
				}
				
			}
//			System.out.println("_________***********______"+id);
			
	 }	
}
