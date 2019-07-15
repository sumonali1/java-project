package Corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new OperaDriver();
		driver.get("http://www.google.com");

	}

}
