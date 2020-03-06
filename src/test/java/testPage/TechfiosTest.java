 package testPage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosPage;
import util.BrowserFactory;


 public class TechfiosTest {
     WebDriver driver;
	 
	@Test
	  public void UserShouldAbleToGoToSite() throws InterruptedException {
		
			driver =  BrowserFactory.startBrowser(); 
			//go to the site
			 driver.get("http://techfios.com/test/101/");
			 
	//Calling TechfiosPage class by creating an object		 
  TechfiosPage tfPage = PageFactory.initElements(driver,TechfiosPage.class );	
  Boolean outcome = tfPage.isToggleAllCheckBoxSelected();
  
	if(outcome == false) {
	 tfPage.ToggleAllChecked();
	  assertTrue("CheckBox is not selected", tfPage.isToggleAllCheckBoxSelected() ); 
	  }
	else {
		  //unselect it
		 tfPage.ToggleAllChecked();
		  //select it
		 tfPage.ToggleAllChecked();
		  assertTrue("CheckBox is not selected", tfPage.isToggleAllCheckBoxSelected());
		  
		  
	  }
	
   //Validating if all elements in the list are checked when the toggle all button 
   assertTrue("All itemsin the list are not selected",tfPage.isToggleAllCheckBoxSelected());
   
  //Test 2: Validate that a single list item could be removed using the remove button
   //when a single checkbox is selected.
   
   //uncheck everything
   tfPage.ToggleAllChecked();
   //method to check if an element is selected
   assertTrue("Element is not selected", tfPage.isAnElementSelectedToRemove());
   //remove single element from list
   tfPage.removeElementFromList();
   
   //Test 3: Validate that all list item could be removed using the remove button
   //and when "Toggle All" functionality is on.
   
   //check all checkboxes, select toggleall to remove the list
   tfPage.ToggleAllChecked();
   //remove entire list
   tfPage.removeElementFromList();
   assertTrue("Warning Massage is not displayed",tfPage.isWarningMassageElementDisplayed() );
   driver.navigate().refresh();
   
   

   
   

   
   
	 
	 }
	
}