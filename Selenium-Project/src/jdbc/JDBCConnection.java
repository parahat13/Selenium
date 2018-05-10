package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCConnection {
	
	WebDriver driver;
	
	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		String host="localhost";
		String port="3306";
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "Root", "Chicago2006@");
		
		Statement createStatement = connection.createStatement();
		
		ResultSet executeQuery = createStatement.executeQuery("select * from Employeeinfo");
		
		while(executeQuery.next())
		{
			
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(executeQuery.getString("name"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(executeQuery.getString("name"));
		
		
		/*
		System.out.println(executeQuery.getString("name"));
		System.out.println(executeQuery.getString("id"));
		System.out.println(executeQuery.getString("location"));
		System.out.println(executeQuery.getString("age"));
		*/
		break;
		}
		
		System.out.println("Passed");
		
	}

}
