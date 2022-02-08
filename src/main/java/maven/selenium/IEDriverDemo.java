package maven.selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) {
		String ieDrivepath = System.getProperty("user.dir") + "\\Resources\\IEDriverServer.exe" ;
		
		System.setProperty("webdriver.ie.driver", ieDrivepath );
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.navigate().to("https://www.visualstudio.com");
		
		driver.quit();
	}

}
