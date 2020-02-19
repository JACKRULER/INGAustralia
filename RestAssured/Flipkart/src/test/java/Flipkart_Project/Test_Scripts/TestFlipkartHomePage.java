package Flipkart_Project.Test_Scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Flipkart.appRelated.ApplicationController;



/**
 * 
 */
public class TestFlipkartHomePage extends BaseTestClassMyApplication {
	
	//ApplicationBaseClass obj1 = new ApplicationBaseClass();
	
	
	@Test(priority=1)
	public void enterUserName()
	{
		homepage.enterUserName("jackpsgtech@gmail.com");
		
		System.out.println("Entered username successfully");
	}

	@Test(priority=2)
	public void enterPassword()
	{
		homepage.enterPassword("sasmita@21");
		
		System.out.println("Entered password successfully");
	}

	
	@Test(priority=3)
	
	public void clickLoginButton() throws Exception
	{
		Thread.sleep(2000);
		homepage.clickLoginButton();
		Thread.sleep(5000);

		 
	}
	
	@Test(priority=4)
	public void searchTextBox() throws Exception
	{ 
		homepage.searchTextBox("Redmi note 8");
		
		
	}
	@Test(priority=5)
	public void addCart() throws Exception
	{
	homepage.addCart();
	
	}
	
}
