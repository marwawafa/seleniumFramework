package maven.selinum;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriverdemo {

	public static void main(String[] args) {
		
		//System.out.println(System.getProperty("user.dir"+"\\resourses\\chromedriver.exe"));
		String chromepath=System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.quit();

	}

}
