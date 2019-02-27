package maven.selinum;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testnggemo2 {
	
	ChromeDriver driver ;
	@BeforeTest 
	public void openurl() {
		String chromepath=System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		
	}
	@Test 
	public void userlogin() {
		System.out.println(driver.getCurrentUrl());
	}	
	@Test 
	public void usercanbuyfromwebsite() {
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void closewebsite() {
		driver.quit();
	}
}
