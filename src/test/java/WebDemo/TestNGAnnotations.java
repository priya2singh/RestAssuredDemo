package WebDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  
  @Test
  public void f1() {
	  System.out.println("Print f1");
  }
  
  @Test
  public void f2() {
	  System.out.println("Print f2");
  }
  @Test
  public void f3() {
	  System.out.println("Print f3");
  }
  @Test
  public void f4() {
	  System.out.println("Print f4");
  }
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("beforeTest");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("afterTest");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  
//	  System.out.println("beforeSuite");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("afterSuite");
//  }

}
