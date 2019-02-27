package maven.selinum;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertiondemo {
	ChromeDriver driver ;
	@Test

	public void gettitle() {
		String chromepath=System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		//Assert.assertEquals(title, "Googlee");
		driver.quit();
		
	}



}
