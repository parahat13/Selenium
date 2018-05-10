package Demo;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Demo {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				           "C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
			    	       // "C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\geckodriver.exe");
		     	    		// "C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\MicrosoftWebDriver.exe");
					         //"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\IEDriverServer.exe");
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		
		
		String expected="Google";
		String actual=driver.getTitle();
	
		
		if(expected.equals(actual)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
			System.out.println("Expected: "+expected);
			System.out.println("Actual: "+actual);
		}
		
		//driver.close();
		
		
	}

}
