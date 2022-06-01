package Step_Definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Mock_01 {
	@Given("^Enter the url$")
	public void enter_the_fake_url() {
		String URL="http://localhost:3000/users";
		given().
		get(URL).
		then().
		statusCode(200).log().all();
		
	}

	@When("^verify the status code$")
	public void verify_the_status_code() {
		System.out.println("Enter the url");

	}

	@Then("^verify the responce$")
	public void verify_the_responce() {
		System.out.println("verify the responce");
	}
}
