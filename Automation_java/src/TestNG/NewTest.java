package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.linkText("Manual FAQs")).click();
	  driver.findElement(By.linkText("Selenium FAQs")).click();
	  driver.findElement(By.linkText("Core Java FAQs")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://selenium4testing.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
