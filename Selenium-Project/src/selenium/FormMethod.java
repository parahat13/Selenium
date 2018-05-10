package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethod {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		
//		System.out.println("Before clicking  mutly  city");
//		System.out.println(driver.findElement(By.id("hp-widget__return")).isDisplayed());
//		driver.findElement(By.xpath("(//label[@class='label_text'])[2]")).click();
//		System.out.println("After clicking  mutly  city");
//		System.out.println(driver.findElement(By.id("hp-widget__return")).isDisplayed());
		
		
		//System.out.println(driver.findElement(By.id("header_tab_hotels")).getText());
		
		
		driver.findElement(By.id("hp-widget__depart")).click();
		driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]")).click();
		
		
		
	}

}
