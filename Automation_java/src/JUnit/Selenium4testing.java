package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium4testing {
	
	public WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("Manual FAQs")).click();
		driver.findElement(By.linkText("Selenium FAQs")).click();
		driver.findElement(By.linkText("Core Java FAQs")).click();
		
	}

}
