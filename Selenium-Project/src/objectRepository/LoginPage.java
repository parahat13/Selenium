package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By username =By.xpath("//input[@id='login1']");
	By password =By.name("passwd");
	By login=  By.name("proceed");
	By home= By.linkText("Home");
	
	
	public WebElement email() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
	
	public WebElement home() {
		return driver.findElement(home);
	}
}
