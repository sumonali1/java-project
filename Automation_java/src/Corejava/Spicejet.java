package Corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Guwahati (GAU)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		driver.findElement(By.linkText("10")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
