package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import helper.Twitterlandingpage;
import locator.Twitterloc;
import values.Twitterval;

public class Logintest extends Config{
	Twitterloc twitloc=new Twitterloc();
	Twitterval twitval=new Twitterval();
	Twitterlandingpage helper=new Twitterlandingpage();
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


}
