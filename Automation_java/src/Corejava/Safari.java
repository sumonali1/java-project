package Corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new SafariDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

}
