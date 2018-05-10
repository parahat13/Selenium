package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts/answer/1733224?hl=en']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentID = iterator.next();
		String childID = iterator.next();
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
	}

}
