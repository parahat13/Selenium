package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	

		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();

		String expected = "Gmail";
		String actual = driver.getTitle();

		if (actual.contains(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}

//==================================================================		
		driver.navigate().back();
		
		expected = "Google";
		actual = driver.getTitle();

		if (actual.contains(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
		
//===================================================================		
		driver.navigate().forward();
		
		expected = "Gmail";
		actual = driver.getTitle();

		if (actual.contains(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
		//driver.close();

	}

}
