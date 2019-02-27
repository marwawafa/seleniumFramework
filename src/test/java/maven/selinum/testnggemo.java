package maven.selinum;

import static org.testng.Assert.fail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testnggemo {
	
	ChromeDriver driver ;
	@BeforeTest(groups= {"Regression"}) 
	public void openurl() {
		String chromepath=System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		
	}
	@Test(priority=0,alwaysRun=true,groups= {"Regression"}) 
	public void userlogin() {
		System.out.println(driver.getCurrentUrl());
		//fail("throw execption");
	
	}	
	@Test(priority=1,dependsOnMethods= {"userlogin"},groups= {"Regression"}) 
	public void usercanbuyfromwebsite() {
		System.out.println(driver.getTitle());
	}
	@Test(groups= {"Live"})
	public void usercanusecreditcard() {
		System.out.println(driver.getTitle());
	}
	@Test(enabled=false) 
	public void skipped() {
		System.out.println("skipped code");
	}
	@AfterTest(groups= {"Regression"})
	public void closewebsite() {
		driver.quit();
	}
}
