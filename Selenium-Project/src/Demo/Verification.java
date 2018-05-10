package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {
	
	
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
		
		driver.navigate().to("https://cybertekschool.com/");
				
		String expected="cybertekschool";
		String actual=driver.getCurrentUrl();
		
		if(actual.contains(expected)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
	
		driver.close();
		
	}

}
