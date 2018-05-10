package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[@id='srch_show_hide_btn']/div[2]")
	WebElement searchIcon;
	
	@FindBy(id="srchword")
	WebElement searchBox;
	
	@FindBy(xpath ="//input[@class='newsrchbtn']")
	WebElement submit;
	
	public WebElement searchIcon() {
		return searchIcon;
	}

	public WebElement searchBox() {
		return searchBox;
	}
	
	public WebElement submit() {
		return submit;
	}
	
	
	//=========================================================================
	// PAGE  OBJECT  MODEL 

	/*
	By searchIcon= By.xpath("//div[@id='srch_show_hide_btn']/div[2]");
	By searchBox=By.id("srchword");
	By submit = By.xpath("//input[@class='newsrchbtn']");
	
	
	public WebElement searchIcon() {
		return driver.findElement(searchIcon);
	}
	
	
	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
	*/
}
