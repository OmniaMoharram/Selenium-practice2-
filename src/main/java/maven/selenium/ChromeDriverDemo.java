package maven.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeDriverDemo {

	public static void main(String[] args) {
		
		String chromePath = System.getProperty ("user.dir")+"\\resources\\chromedriver.exe" ;
		
		//System.out.println(System.getProperty("user.dir"+"\\resources\\chromedriver.exe"));


		System.setProperty("webdriver.chrome.driver", chromePath);
				
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com/?hl=ar");

		driver.quit();
	}

}
