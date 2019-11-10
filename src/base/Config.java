package base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.Webdriverfunction;




public class Config extends Webdriverfunction {
	
	@BeforeMethod(alwaysRun=true)
	public void browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shabbir.DESKTOP-DKE3O53\\Documents\\GitHub\\twitterlogin\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
//		if(browsername.equalsIgnoreCase("chrome")){
//			System.out.println("chrome is going to run");
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\shabbir.DESKTOP-DKE3O53\\Documents\\GitHub\\twitterlogin\\drivers\\chromedriver.exe");
//			driver=new ChromeDriver();
//			
//		}
//		else if(browsername.equalsIgnoreCase("firefox")){
//			System.out.println("firefox is going to run");
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\shabbir.DESKTOP-DKE3O53\\Documents\\GitHub\\twitterlogin\\drivers\\geckodriver.exe");
//			driver=new FirefoxDriver();
//		}
		driver.get("https://twitter.com/");
		pageload();
		maxscreen();
		waittime();
		
	}
	@AfterMethod(alwaysRun=true)
	public void afterEachMethod(){
		System.out.println("After each method");
		driver.quit();
		
	}

}
