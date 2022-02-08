package maven.selenium;




import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGDemo {

	ChromeDriver driver;

	@BeforeTest (groups = {"live"})
	public void openURL () {

		//System.out.println("i run only one time before test ");
		String chromePath = System.getProperty ("user.dir")+"\\resources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");

	}

	@Test (groups = {"regression"})
	public void userCanLogin() {
		System.out.println(driver.getCurrentUrl() );
	
	}


	@Test (groups = {"regression"})
	public void usercanbuyfromthewebsite () {

		System.out.println(driver.getTitle() );
	}
	
	@Test (groups = {"live"})
	public void usercanusecreditcard () {

		System.out.println(driver.getTitle() );
	}
		

	@AfterTest (groups = {"live"})
	public void closeWebsite() {
		driver.quit();


	}
}
