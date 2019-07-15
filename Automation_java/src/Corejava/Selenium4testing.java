package Corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium4testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
		driver.findElement(By.linkText("Manual FAQs")).click();
		driver.findElement(By.linkText("Selenium FAQs")).click();
		driver.findElement(By.linkText("Core Java FAQs")).click();
		driver.findElement(By.linkText("Downloads")).click();
		driver.findElement(By.xpath(".//*[@id='topbar_container']/div/div[2]/ul/li[1]/a")).click();
	}

}
