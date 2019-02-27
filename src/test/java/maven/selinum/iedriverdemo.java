package maven.selinum;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iedriverdemo {
	
	public static void main(String[] args) {
		
		String iepath=System.getProperty("user.dir")+"\\resourses\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",iepath );
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.visualstudio.com");
		
		driver.quit();
		

	}
}
