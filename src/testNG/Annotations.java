package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations {
  @Test
  public void function1() {
	  System.out.println("This is @test");
  }
  
  @Test
  public void function2() {
	  System.out.println("This is @test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" @Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" @After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println(" @Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" @After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println(" @Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" @After Test");
  }

}
