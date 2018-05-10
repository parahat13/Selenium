package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		
		// Count of the Links  in  the entire page
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("Links in  the  page: "+size);
		
		
		// Count of the Footer link 
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		int size2 = footer.findElements(By.tagName("a")).size();
		System.out.println("Links  in  the  footer:  "+size2);
		
		// Count  in the  second  column
		WebElement column = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links  in  the  second  column");
		System.out.println(column.findElements(By.tagName("a")).size());
		
		
	//	System.out.println("Texts  of  links in  the  second  column:  ");
		System.out.println("Before  cliciking  Site  Map: "+driver.getTitle());
		
		String BeforeClicking = "";
		String AfterClicking;
		
		for(int i=0; i<column.findElements(By.tagName("a")).size(); i++) {
			//String text = column.findElements(By.tagName("a")).get(i).getText();
			//System.out.println(text);
			
			if(column.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				BeforeClicking=driver.getTitle();
				column.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		
			AfterClicking=driver.getTitle();
			if(BeforeClicking!=AfterClicking) {
				boolean displayed = driver.findElement(By.xpath("//div[@id='buy']/h2")).isDisplayed();
				
				if(displayed==true) 
					System.out.println("PASS");	
				
			}else {
				System.out.println("FAIL");
			}
		
		String text = driver.findElement(By.tagName("a")).getText();
		System.out.println(text);
	}
}