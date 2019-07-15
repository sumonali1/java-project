package Corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercuryregistration {
	
	public WebDriver driver;
	
	public void Openurl(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	public void Register(){
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sam");
		driver.findElement(By.name("lastName")).sendKeys("Ayan");
		driver.findElement(By.name("phone")).sendKeys("9786453211");
		driver.findElement(By.name("userName")).sendKeys("samayan@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("2345 Main St");
		driver.findElement(By.name("city")).sendKeys("Boston");
		driver.findElement(By.name("state")).sendKeys("MA");
		driver.findElement(By.name("postalCode")).sendKeys("02431");
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED KINGDOM");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.linkText("sign-in")).click();
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mercuryregistration m=new Mercuryregistration();
		m.Openurl();
		m.Register();
		
	}

}
