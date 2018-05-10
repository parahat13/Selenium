package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class LoginApplication {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		LoginPage rd = new LoginPage(driver);
		rd.email().sendKeys("Hello");
		rd.password().sendKeys("Password");
		//rd.login().click();
		rd.home().click();
		
		//=============================================
		
		HomePage hm= new HomePage(driver);
		hm.searchIcon().click();
		hm.searchBox().sendKeys("Iphone");
		hm.submit().click();
		

	}

}
