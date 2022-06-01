package WebDemo;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;

//import groovyjarjarantlr4.v4.codegen.model.Action;

public class NewTest {
			
	WebDriver driver;
	
	
	public void set() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\Created_by_me\\RestAssuredDemo\\src\\test\\java\\exefile\\chromedriver.exe");
		  driver= new ChromeDriver();
	}
//  @Test(priority=1)
  public void f() throws InterruptedException {
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\Created_by_me\\RestAssuredDemo\\src\\test\\java\\exefile\\chromedriver.exe");
//	  driver= new ChromeDriver();
	  set();
	  driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	  Actions act= new Actions(driver);
	  
	  String a="//*[@id=\"column-a\"]";
	  String b="//*[@id=\"column-b\"]";
	  
	  WebElement rightSlider= driver.findElement(By.xpath(a));
	  WebElement leftSlider= driver.findElement(By.xpath(b));
	  act.clickAndHold(rightSlider).perform();
	  Thread.sleep(2000);
	  act.dragAndDrop(rightSlider, leftSlider).perform();
//	  Thread.sleep(2000);
	  act.release().perform();
	 
  }
  
//  @Test(priority=2)
  
  public void WebElemnt() throws InterruptedException {
	 /*
	  * Webelement is an interface 
	  *  1. FindElement()
	  *  2. sendkeys()
	  *  3. click()
	  *  4. clear()
	  *  5. gettext()
	  *  6. getAtribute()
	  *  7. getcssvalue()
	     8. getsize()
	     9. isDisplayed()
	     10. isSelected()
	     11. isEnabled()
	     12. submit()
	  */
	 
//	  set();
//	  driver.get("https://the-internet.herokuapp.com/");
//	  //1 findElemnt(), Click()
//	  driver.findElement(By.xpath("//*[text()=\"Add/Remove Elements\"]")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("//*[text()=\"Delete\"]")).click();
//	  driver.close();
	  set();
	  driver.get("https://demoqa.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[text()=\"Elements\"]")).click();
	  driver.findElement(By.xpath("//span[text()=\"Text Box\"]")).click();
	  driver.findElement(By.xpath("//*[@placeholder=\"Full Name\"]")).sendKeys("PRIYA SINGH");
	  
	  String atribute = driver.findElement(By.xpath("//*[@placeholder=\"Full Name\"]")).getAttribute("placeholder");
	  System.out.println("***______"+atribute+"_______***");
 
	  String name = driver.findElement(By.xpath("//*[text()=\"Text Box\"]")).getText();
	  System.out.println("*******______"+name+"_______**********");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@placeholder=\"Full Name\"]")).clear();
	  
	  int height = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).getSize().getHeight();
	  System.out.println("*******______"+height+"_______**********");
	  
	  int width = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).getSize().getWidth();
	  System.out.println("******______"+width+"_______*******");
	  
	  boolean textboxdisplay = driver.findElement(By.xpath("//*[text()=\"Text Box\"]")).isDisplayed();
	  System.out.println("***______"+textboxdisplay+"_______***");
	  driver.findElement(By.xpath("//*[text()=\"Check Box\"]")).click();
//	  driver.findElement(By.xpath("//*[@class =\"rct-checkbox\"]")).click();
	  boolean selected=driver.findElement(By.xpath("//*[@class =\"rct-checkbox\"]")).isSelected();
	  System.out.println("-------------"+selected+"-----------");
//	  
	  js.executeScript("window.scrollBy(0,500)");
	  String size=driver.findElement(By.xpath("//*[text()=\"Forms\"]")).getCssValue("font-size");
	  System.out.println("________"+size+"__________");
	  String width1=driver.findElement(By.xpath("//*[text()=\"Forms\"]")).getCssValue("width");
	  System.out.println("________"+width1+"__________");
	  
	  //IF click button is not working then we can use submit button
	  driver.findElement(By.xpath("//*[text()=\"Forms\"]")).submit();
//	  driver.close();
	  
	  
  }
//  @Test
  public void Select() throws InterruptedException {
	  /* select is a class
	   * it is use for to handle dropdown and combobox
	   * In order to select option present inside dropdown there are 3 methods 
	   1.selectByIndex
	   2.SelectByValue
	   3.SelectByVisibleText
	   4.deselecetByIndext
	   5.DeselectByVisibleText
	   6.DeselectByValue
	   7.isMultiple  (boolean) //If we want to verify that the dropdown is single select or multiple select then we use ismultiple
	   8.GetOption     // to findout how many optins is available in dropdown
	   9.getfirstSelectOption
	   10.getAllSelectOptions
	   11.DesectAll
	   */
	  
	  set();
	  driver.get("https://demoqa.com/");
	  driver.manage().window().maximize();

	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[text()=\"Elements\"]")).click();
	  js.executeScript("window.scrollBy(0,1500)");
	  driver.findElement(By.xpath("//*[text()=\"Widgets\"]")).click();
	  Thread.sleep(1000);
//	  js.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.xpath("(//*[text()=\"Select Menu\"])[1]")).click();
	  WebElement drpdown=driver.findElement(By.id("oldSelectMenu"));
	   Select sel=new Select(drpdown);
	  	  sel.selectByIndex(3);
	  	  Thread.sleep(2000);
	  	  sel.selectByValue("red");
	  	  Thread.sleep(2);
	  	  sel.selectByVisibleText("Yellow");
	  	  boolean flag= sel.isMultiple();
	  	  if(flag) {
	  		  System.out.println("____________multiple select dropdown_____________"+ flag);
	  	  }
	  	  else {
	  		  System.out.println("__________Single select dropdown_____________"+flag);
	  	  }
//	  	  
	  	  List<WebElement> dropdownoption=sel.getOptions();
	  	   System.out.println("_____________"+dropdownoption.size()+"__________________");
	  	  
	  	  WebElement option = sel.getFirstSelectedOption();
	  	  System.out.println("________________"+option.getText());
//	  	  
//	  	  Multiple option
	  	  
		  driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		  driver.manage().window().maximize();

		  Thread.sleep(2000);
		  WebElement mldrpdown=driver.findElement(By.id("multi-select"));
		   Select mlsel=new Select(mldrpdown);
		   mlsel.selectByIndex(1);
		   Thread.sleep(2000);
		   mlsel.selectByValue("New York");
		   Thread.sleep(2000);
		   mlsel.selectByVisibleText("Texas");
		   List<WebElement> alloption=mlsel.getAllSelectedOptions();
		   System.out.println("_______________"+alloption.size()+"________________");
		   
		   Thread.sleep(2000);
		   mlsel.deselectByIndex(1);
		   Thread.sleep(2000);
		   mlsel.deselectByValue("New York");
		   Thread.sleep(2000);
		   mlsel.deselectByVisibleText("Texas");
   
		  
		   Thread.sleep(2000);
		   mlsel.selectByValue("New York");
		   
		   Thread.sleep(2000);
		   mlsel.selectByIndex(1);
		   Thread.sleep(2000);
		   mlsel.selectByVisibleText("Texas");
		   Thread.sleep(2000);
		   
		   WebElement firstoption = mlsel.getFirstSelectedOption();
		   System.out.println("______select first option_________"+firstoption.getText()+"________________");
		   Thread.sleep(2000); 
		   mlsel.deselectAll();
		   Thread.sleep(2000);
		   List<WebElement> alloption1=mlsel.getAllSelectedOptions();
		   System.out.println("_______________"+alloption1.size()+"________________");
//		   
		   
		   
		   
		   
		   
		   
//	  	js.executeScript("window.scrollBy(0,500)");
//	  	Thread.sleep(2000);
//	  	driver.findElement(By.xpath("//div[text()='Select...']")).click();
//	  	Thread.sleep(2000);
//	  	  driver.findElement(By.xpath("//*[@id='react-select-4-input']")).sendKeys("Green");
//	  	  Thread.sleep(2000);
//	  	  driver.findElement(By.xpath("//input[value='Green']")).click();
//	  	Select mlsel=new Select(mldropdown);
//	  	mlsel.selectByIndex(2);
	  	
  }
  
  
//  @Test
  public void Action() throws InterruptedException {
	  /*
	   * In selenium we can handle mouse option using action class 
	   * 1. perform()
	   * 2. moveToElement()
	   * 3. click()
	   * 4. SendKeys()
	   * 5. contextClick()
	   * 6. doubleClick()
	   * 7. moveByOffset()
	   * 8. ClickandHold()
	   * 9. release()
	   * 10. DragAndDrop()
	   *  mouseOver-- moveToElement() +perform()
	   *  mouseClick-- click()+perform()
	   *  right Click -- Contextclick()+ perform()
	   *  double Click-- doubleClick()+ perform()
	   *  range Slider-  1. ClickAndHold()+perform(), 2.moveByOffset()+ perform(), 3. release()+ perform()
	   *  Drag and Drop -- 1. ClickandHold()+Perform(), 2. dragAndDropBy()+perform(), 3. release()+ perform()
	   *  Keyboard op-- sendKeys() + perfrom()
	   *  
	   */
//	  set();
//	  driver.get("http://mrbool.com/");
//	  driver.manage().window().maximize();
////	  JavascriptExecutor js= (JavascriptExecutor) driver;
////	  js.executeScript("window.scrollBy(0,500)");
//	  Thread.sleep(2000);
////	  driver.findElement(By.xpath("//*[@class='menulink']")).click();
//	  
//	  //  1. mouseOver
//	  Thread.sleep(2000);
//	  WebElement form = driver.findElement(By.xpath("//*[@class='menulink']"));
//	  Actions act=new Actions(driver);
//	  Thread.sleep(2000);
//	  System.out.println("**************");
//	  
////	  //  2. mouse over 
//	  act.moveToElement(form).perform();
//	  System.out.println("**************");
////	  
////	  //  3. Mouse click 
//	  Thread.sleep(1000);
//	  WebElement Acticle = driver.findElement(By.xpath("(//*[text()='Articles'])[1]"));
//	  act.click(Acticle).perform();
//	  System.out.println("**************");
//// 
////	  //  4. Double click
//	  Thread.sleep(1000);
//	  WebElement form1 = driver.findElement(By.xpath("(//*[text()='Article'])[1]"));
//	  Thread.sleep(1000);
//	  act.doubleClick(form1).perform();
//	  System.out.println("Double click ");
////	  
////	  //  5. Right click 
//	  Thread.sleep(2000);
//	  act.contextClick(form1).perform();

//	   Drag and drop
	  set();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Actions act1=new Actions(driver);
	  WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	  driver.switchTo().frame(frame);
	 WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement destination = driver.findElement(By.xpath("//*[@id='droppable']"));
//	act1.clickAndHold(source).moveToElement(destination).release().build().perform();
	Thread.sleep(1000);
	act1.clickAndHold(source).perform();
	Thread.sleep(2000);
	act1.dragAndDrop(source, destination).perform();
	Thread.sleep(2000);
	act1.release(destination).perform();
	
	// 6. Range slider
	Thread.sleep(2000);
	 driver.get("https://jqueryui.com/slider/#colorpicker");
	 Thread.sleep(2000);
	 frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	 driver.switchTo().frame(frame);
	  WebElement slider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
	  act1.clickAndHold(slider).perform();
	  Thread.sleep(1000);
	  act1.moveByOffset(-100, 150).perform();
	  Thread.sleep(1000);
	  act1.release(slider).perform();

//	  Thread.sleep(2000);
//	  driver.get("https://jqueryui.com/slider/#colorpicker");
//	  Thread.sleep(3000);
//	  act1.sendKeys(Keys.ARROW_DOWN).perform();
//	  Thread.sleep(2000);
//	  act1.sendKeys(Keys.ARROW_UP).perform();
	 
	  
	    
  }
  
  
// @Test
 public void Windowhandling() throws InterruptedException {
	 //WebDriver is an interface 
	 //1.getwindowhandle()
	 //2. close()
	 //3. quit()
	 
	set();
//	Thread.sleep(2000);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String ParentID= driver.getWindowHandle();
	System.out.println(ParentID);

//	driver.close();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	
	//Multiple window
//	driver.findElement(By.id("newWindowBtn")).click();
//    Set<String> allWindow = driver.getWindowHandles();
//    int count=allWindow.size();
//    System.out.println("Window size"+ count);
//    
//    for(String handle:allWindow ) {
//    	System.out.println(handle);
//    	if(!handle.equals(ParentID)) {
//    		driver.switchTo().window(handle);
//    		js.executeScript("window.scrollBy(0,500)");
//    		driver.findElement(By.xpath("//*[@placeholder='Enter First Name']")).sendKeys("Priya");
//    		Thread.sleep(5000);
//    		driver.close();
//    	}
//    	
//    }
//    driver.switchTo().window(ParentID);
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("360 logica");
////    driver.findElement(By.id("newTabBtn")).click();
//    
    
    
    
    
    
    
//    We are handling the tab 
	driver.findElement(By.id("newTabBtn")).click();
    Set<String> allWindow = driver.getWindowHandles();
    int count=allWindow.size();
    System.out.println("Window size"+ count);
    
    for(String handle:allWindow ) {
    	System.out.println(handle);
    	if(!handle.equals(ParentID)) {
    		driver.switchTo().window(handle);
    		js.executeScript("window.scrollBy(0,500)");
//    		driver.findElement(By.xpath("//*[@placeholder='Enter First Name']")).sendKeys("Priya");
    		Thread.sleep(5000);
    		driver.close();
    	} }
    driver.switchTo().window(ParentID);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("360 logica");
//	driver.quit();

 
    
    
    
    
    
    
    
    
    
    //Handle multiple window 
// 
//	driver.findElement(By.id("newWindowsBtn")).click();
//  Set<String> allWindow = driver.getWindowHandles();
//  int count=allWindow.size();
//  System.out.println("Window size"+ count);
//  
//  for(String handle:allWindow ) {
//  	System.out.println(handle);
//  	if(!handle.equals(ParentID)) {
//  		driver.switchTo().window(handle);
//  		js.executeScript("window.scrollBy(0,500)");
//  		driver.findElement(By.xpath("//*[text()='First Name ']/following-sibling::input[1]")).sendKeys("Priya");
//  		Thread.sleep(5000);
//  		driver.close();
//  	}
//  	
//  	else if(!handle.equals(ParentID)) {
//  		Thread.sleep(2000);
//  		driver.switchTo().window(handle);
//  		js.executeScript("window.scrollBy(0,500)");
////  		driver.findElement(By.xpath("//*[@placeholder='Enter First Name']")).sendKeys("Priya singh");
//  		Thread.sleep(5000);
//  		driver.close();
//  	}
//  	}
//  driver.switchTo().window(ParentID);
//  Thread.sleep(2000);
//  driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("360 logica");
////	driver.quit();
    
    
    
//	Iterator<String> itr = sessionID.iterator();

	 
 }
  
  
  
  
//  @Test
  public void frameswiching() {
	  	 /*
	  	By Index
	  	By Name or Id
	  	By Web Element
	  	driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	  	 */
	  
	  set();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/frames");
	  int size = driver.findElements(By.tagName("iframe")).size();
	  System.out.println("Number of iframe is "+ size);
	  	            
//		//Commented the code for finding the index of the element
//	    driver.switchTo().frame(0); //Switching to the frame
//		System.out.println("********We are switched to the iframe*******");
//		driver.findElement(By.xpath("html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	    
	    //switching back from the iframe
//	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame1");
	    String textis= driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	    System.out.println("_____text is____: "+ textis);
	    
	    driver.switchTo().defaultContent();
//	    driver.switchTo().parentFrame();
//	    
	    driver.switchTo().frame("frame2");
	    
	    String text2= driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	    System.out.println("_____text is____: "+ text2);
//	    
//	    driver.switchTo().defaultContent();
//	    
//	    
//	    
	    set();
	    driver.get("https://demoqa.com/nestedframes");
	  driver.switchTo().frame("frame1");
	 String text= driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	    System.out.println("**************"+ text);
	    
	     WebElement childframe = driver.findElement(By.xpath("/html/body/iframe"));
	    driver.switchTo().frame(childframe);
	    
	    String text1= driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	    System.out.println("**************"+ text1);
	    
	    driver.switchTo().parentFrame();
//	    driver.switchTo().defaultContent();
	    
	    String text3= driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	    System.out.println("**************"+ text3);
	    
	  
  }
  
//  @Test
  public void Popuphandling() throws InterruptedException {
	  /*
	   * Alert
	   * accept()
	   * dismiss()
	   * getText()
	   */
	  set();
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  Alert alrt = driver.switchTo().alert();
	  Thread.sleep(2000);
	  String text = alrt.getText();
	  System.out.println("**********: "+text);
	  Thread.sleep(2000);
//	  alrt.accept();
	  alrt.dismiss();
  }
  
  
  
  
//  @Test
  public void Assertion()
  {
	  /*
	   * Two type of assertion 
	   * 1. Hard Assert (we use hard assert for basic and critical feature)
	   * 2. Soft Assert (use soft assert for minor feature) 
	   * 
	   *1. Hard Assert
	   * assert is a class 
	   * Methods under Assert class
	   * assetEquals()
	   * assertNotEquals()
	   * assertTrue()
	   * assertFalse()
	   * assertNull()
	   * assetNotNull()
	   * assertSame()
	   * assertNotSame()
	   * 
	   * 2. Soft Assert
	   * assetEquals()
	   * assertNotEquals()
	   * assertTrue()
	   * assertFalse()
	   * assertNull()
	   * assetNotNull()
	   * assertSame()
	   * assertNotSame()
	   * assertAll()
	   */
//	  
//	  set();
//	  driver.get("https://www.google.com/");
//	  String Actualtitle=driver.getTitle();
//	  String Expectedtitle="google";
//	  Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  
	  
	  
	  
	  SoftAssert SoftAssert=new SoftAssert();
	  System.out.println("Open Browser");
//	  Assert.assertEquals(true, false);
//	  SoftAssert.assertEquals(false, true);
//	  Assert.assertNotEquals(1, 2);
//	  String name="Priya Singh";
//	  SoftAssert.assertFalse(name.contains("Priya"));
//	  System.out.println("***********");
//	  Assert.assertFalse(true);
//	  Assert.assertSame(name, "Priya Singh");
	  
	  
//	 Diifrence between assertequals and assertsame
//	  pointV1 p1= new pointv1();
//	  pointV1 p2= new pointv1();
//	  pointV1 p3= p1;
//	  assertsame(p1,p3); right
//	  assertsame(p1,p2); wrong
//	  Assertsame if ex1 and ex2 refer to the same object 
//	  int i=10
//	  int j=10;
//	  assertequals(i,j);
//	  assertequal when the value ex1==ex2 are same or primitive
	  
	   obj obj1=new obj(10);
	   obj obj=new obj();
	   obj1.setJ(10);
	   obj obj2=new obj(20);
	   obj2.setJ(10);
	  obj obj3=obj1;
	  obj obj4=obj1;
	  System.out.println("********1******"+obj1.getJ()+" "+obj3+" "+obj1+" "+ obj2);
	  Assert.assertEquals(obj1.getJ(), obj2.getJ());
	  System.out.println("******2********");
	  int i=10;
	  int j=10;
	  String name ="Priya";
	  String name2="Priya";
	  String name1= new String("Priya");
	  System.out.println("++ name "+ name+"___name1 "+name1+"*** name2 "+ name2);
	  if(name.equals(name1)) {
		  System.out.println("True");
	  }
	  else 
	  {
		  System.out.println("False");
	  }
	  
	  
	  if(name==name2) {
		  System.out.println("True");
	  }
	  else 
	  {
		  System.out.println("False");
	  }
	  
	  
	  
	  
	
	  
	  Assert.assertSame(i, j);
	  System.out.println("*******3*******"); 
	  Assert.assertNull(null);
	  Assert.assertNotNull(obj);
	  System.out.println("_______");
	  System.out.println("Enter User name");
//	  SoftAssert.assertEquals(1, 2);
	  System.out.println("Enter Password");
//	  SoftAssert.assertEquals("Priya", "Singh");
	  System.out.println("Click on signin button");
	  
	  
//	  Assert.assertEquals(true, true);
//	  
//	  System.out.println("Verify the appication page");
//	  SoftAssert.assertEquals(true, false, "application page not found");
//	  
//	  System.out.println("open affiiates");
//	  System.out.println("Create affiliates");
//	  System.out.println("Successfully created");
//	  SoftAssert.assertEquals(true, false,"Affiliates is not created successfully");
//	  
//	  System.out.println("Open Group");
//	  System.out.println("Create Group");
//	  System.out.println("Successfully created");
//	  SoftAssert.assertEquals(true, false, "Group is not created successfully");
//	  
	  SoftAssert.assertAll();
//	  
	  
  }
  
  
  @Test
  
  public void screenshot() throws IOException, InterruptedException {
	  
//	  Steps to to take screenshot
//	1.  Convert webdriver object into Takescreenshot
//	 TakeScreenshot src= (TakeScreenshot) webdriver;
//	2. call getscreenshot method to Create image file
//		File SrcFile=src.getScreenshotAs(outputType.file);
//	3. Copy file to desire location
//	FileUtils.copyFile(ScrFile, DestFile);
	  
	  
	  set();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  TakesScreenshot src=(TakesScreenshot)driver;
	  File srcFile = src.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcFile, new File("C:\\Users\\priya\\Downloads\\Created_by_me\\RestAssuredDemo\\src\\test\\java\\WebDemo\\Test1.jpg"));
	  System.out.println("Script capture the screenshot is pass ");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//  @Test(invocationCount = 3)
	  public void Practice() {
		  set();
	  }
  
//  @Test(groups = {"Smoke"})
  public void group() {
	  
  }
  
//@Test(enabled = true)
public void methoddistable() {
	  
}
  }

