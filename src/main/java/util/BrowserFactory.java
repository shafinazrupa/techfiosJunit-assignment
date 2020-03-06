package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Maven Test Project

public class BrowserFactory {
	
 //Global, so all methods can use
	 WebDriver driver;
	
	public static WebDriver startBrowser() {
		
		//Set Chrome driver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();
		//driver.get("http://techfios.com/test/101/");
		//Return the driver to the Test class
		return driver;
		
	}
}
