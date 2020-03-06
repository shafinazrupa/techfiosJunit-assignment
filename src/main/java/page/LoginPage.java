package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    	}
 //Element Library
	//By userName = By.id("user_login");
	//WebElement username = driver.findElement(By.id("username"));
	@FindBy(how = How.NAME, using = "log") WebElement Username;
	@FindBy(how = How.NAME, using = "pwd") WebElement Password;
	@FindBy(how = How.ID, using = "wp-submit") WebElement Login;
	
	//Methods to interact with the Elements
	public void login() {
		Username.sendKeys("opensourcecms");
		Password.sendKeys("opensourcecms"); 
		Login.click();
	}
//If I want to put username and password
	//	public void login(String username  , String password) {
//		Username.sendKeys(username);
//		Password.sendKeys(password);
//	    Login.click();
//	}

   public String getTheTitle() {
		return driver.getTitle();
	}	
		
}  
	

	
	

	
	
	
	
	

