package testNG;

import org.testng.annotations.Test;

public class Grouping {
	
  @Test(groups={"Car"})
  public void car() {
	  
	  System.out.println("car");
	  
  }
  @Test(groups={"Car"})
  public void car1() {
	  
	  System.out.println("car1");
  }
  @Test(groups={"Scooter"})
  public void Scooter() {
	  
	  System.out.println("Scooter");
  }
  @Test(groups={"Scooter"})
  public void Scooter1() {
	  
	  System.out.println("Scooter");
  }
  @Test(groups={"Car","Sedan"})
  public void car2() {
	  
	  System.out.println("Sedan");
  }
  
}
