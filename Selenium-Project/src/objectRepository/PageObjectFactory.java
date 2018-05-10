package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFactory {

	WebDriver driver;

	public PageObjectFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(linkText = "Home")
	WebElement homeButton;

	
	public  WebElement username() {
		return username;
	}

	public  WebElement password() {
		return password;
	}
	
	public  WebElement homeButton() {
		return homeButton;
	}


}
