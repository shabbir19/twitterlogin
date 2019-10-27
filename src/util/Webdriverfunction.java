package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webdriverfunction {
	public WebDriver driver;
	
	public void pageload(){
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	public void maxscreen(){
		driver.manage().window().maximize();
	}
	public void waittime(){
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void TypeByXpath(String locator,String values){
		driver.findElement(By.xpath(locator)).sendKeys(values);
	}
	public void ClickByXpath(String locator){
	driver.findElement(By.xpath(locator)).click();	
	}
	
	
	
	

}



