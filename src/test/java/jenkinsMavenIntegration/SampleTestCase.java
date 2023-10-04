package jenkinsMavenIntegration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestCase {
	
	WebDriver driver;
	
	
	@Parameters("browser")
	@Test
	public void lauchBrowser(String Launching_browser)
	{
		
		System.out.println("Launch browser is : " + Launching_browser);
		
		
		
//		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\Softwares\\browserDrivers\\chromedriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		
		
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
//		Assert.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();
	}

}
