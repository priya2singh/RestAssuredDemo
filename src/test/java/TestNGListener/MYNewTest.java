package TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.MYNewTest.class)
public class MYNewTest extends Testnglistener {
	WebDriver driver;
	
  @Test
  public void VerygoogleText() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\Created_by_me\\RestAssuredDemo\\src\\test\\java\\exefile\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.getTitle();
	  driver.close();
	  
  }
}
