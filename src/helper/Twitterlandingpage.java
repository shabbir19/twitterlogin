package helper;

import org.openqa.selenium.By;
import org.testng.Assert;


import locator.Twitterloc;
import util.Webdriverfunction;
import values.Twitterval;

public class Twitterlandingpage extends Webdriverfunction {
	Twitterloc twitloc=new Twitterloc();
	Twitterval twitval=new Twitterval();
	public void twitterurltest(){
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://twitter.com/")){
			System.out.println("Browser opened twitter homepage");
		}
		else{
			System.out.println("Browser couldnt open twitter page");
		}
	}
	public void twitterlogin(){
		System.out.println("twitter login");
		ClickByXpath(twitloc.signin);
		
		TypeByXpath(twitloc.email,twitval.email_val);
		TypeByXpath(twitloc.password,twitval.pass_val);
		ClickByXpath(twitloc.login);
	}
	public void loginverify(){
		String Name=driver.findElement(By.xpath("//*[@id=\'react-root\']/div/div/div/main/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/h2/span")).getText();
		String actName=Name.trim();
		System.out.println(actName);
		Assert.assertEquals(actName, "Home");
		
	}
	public void loginwthinvalidpass(){
		System.out.println("target login with invalid password");
		ClickByXpath(twitloc.signin);
		
		TypeByXpath(twitloc.email,twitval.email_val);
		TypeByXpath(twitloc.password,twitval.invalidpass_val);
		ClickByXpath(twitloc.login);
	}
	

}



