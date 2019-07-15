package Corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\NVU2018\\OneDrive\\QA & Selenium\\Selenium\\Selenium\\Library\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}
