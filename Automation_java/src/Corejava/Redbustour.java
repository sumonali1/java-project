package Corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbustour {
	
	public WebDriver driver;
	
	public void Openurl(){
		driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
	}
	
	public void Register() throws Exception{
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		driver.findElement(By.id("dest")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[3]")).click();
		driver.findElement(By.id("return_cal")).click();
		driver.findElement(By.xpath(".//*[@id='rb-calendar_return_cal']/table/tbody/tr[7]/td[5]")).click();
		driver.findElement(By.id("search_btn")).click();
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Redbustour b=new Redbustour();
		b.Openurl();
		b.Register();
		
	}

}
