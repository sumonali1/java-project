package Corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NVU2018\\OneDrive\\QA & Selenium\\Selenium\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
