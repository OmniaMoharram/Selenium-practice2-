package maven.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo {
	

	public static void main(String[] args) {
		
	String	firefoxpath = System.getProperty("user.dir") + "\\resources\\geckodriver.exe" ;
		
		System.setProperty("webdriver.gecko.driver", firefoxpath );

		FirefoxDriver driver = new FirefoxDriver() ;
		
		driver.navigate().to("https://www.amazon.com");
		
		driver.quit();
	}

}
