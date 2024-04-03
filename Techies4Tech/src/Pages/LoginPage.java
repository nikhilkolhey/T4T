package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	@Test
	public void Login(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\firefox standalone\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.techies4tech.ai");
		driver.manage().window().maximize();
		
	}
}
