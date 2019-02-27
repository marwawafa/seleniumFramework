package maven.selinum;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firfoxdriverdemo {

	public static void main(String[] args) {
		String firefoxpath=System.getProperty("user.dir")+"\\resourses\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",firefoxpath );
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.quit();

	}

}
