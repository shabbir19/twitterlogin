package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import helper.Twitterlandingpage;
import locator.Twitterloc;
import values.Twitterval;

public class Logintest extends Config{
	Twitterlandingpage helper=new Twitterlandingpage();
	Twitterloc twitloc=new Twitterloc();
	Twitterval twitval=new Twitterval();
	@Test
	public void twitterurltest(){
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://twitter.com/")){
			System.out.println("Browser opened twitter homepage");
		}
		else{
			System.out.println("Browser couldnt open twitter page");
		}
	}
	@Test(enabled=false)
	public void tittletest() {
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("https://twitter.com/")){
			System.out.println("Browser opened twitter homepage");
		}
		else{
			System.out.println("Browser couldnt open twitter page");
		}
		
	}
	@Test
	public void twitterlogin(){
		System.out.println("twitter login");
		ClickByXpath(twitloc.signin);
		
		TypeByXpath(twitloc.email,twitval.email_val);
		TypeByXpath(twitloc.password,twitval.pass_val);
		ClickByXpath(twitloc.login);
	}
	@Test
	public void loginverify(){
		String Name=driver.findElement(By.xpath("//*[@id=\'react-root\']/div/div/div/main/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/h2/span")).getText();
		String actName=Name.trim();
		System.out.println(actName);
		Assert.assertEquals(actName, "Home");
		
	}
	@Test
	public void loginwthinvalidpass(){
		System.out.println("target login with invalid password");
		ClickByXpath(twitloc.signin);
		
		TypeByXpath(twitloc.email,twitval.email_val);
		TypeByXpath(twitloc.password,twitval.invalidpass_val);
		ClickByXpath(twitloc.login);
	}
	


}
