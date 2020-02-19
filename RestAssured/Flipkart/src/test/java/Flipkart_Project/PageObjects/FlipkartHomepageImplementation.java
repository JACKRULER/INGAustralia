package Flipkart_Project.PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Flipkart.appRelated.ApplicationController;

public class FlipkartHomepageImplementation implements FlipkartHomepage {

	public WebDriver driver;

	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/../preceding-sibling::input")
	private WebElement userNameTextBox;

	@FindBy(xpath = "//div[contains(text(),'Redmi Note 8 ')]")
	private WebElement searchElement;

	@FindBy(css = "input._2zrpKA._3v41xv._1dBPDZ")
	private WebElement enteringPassword;

	@FindBy(css = " button._2AkmmA._1LctnI._7UHT_c")
	private WebElement clickingloginButton;

	@FindBy(css = "input.LM6RPg")
	private WebElement searchTextBox;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addToCartButton;
	
	
	@FindBy(css = "gdUKd9:nth-child(2)")
	private WebElement removeItem;


	public FlipkartHomepageImplementation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterWrongUsername(String userName) {
		userNameTextBox.sendKeys(userName);
	}

	public void enterUserName(String username) {
		// TODO Auto-generated method stub
		userNameTextBox.sendKeys(username);

	}

	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		enteringPassword.sendKeys(password);
	}

	public void clickLoginButton() {
		// TODO Auto-generated method stub
		clickingloginButton.submit();
	}

	public void searchTextBox(String SearchBox) throws Exception {
		// TODO Auto-generated method stub
		searchTextBox.sendKeys(SearchBox);
		/*
		 * Actions actions = new Actions(ApplicationController.instance.driver); //
		 * actions.sendKeys(Keys.TAB).build().perform();
		 * actions.sendKeys(Keys.ENTER).build().perform(); searchElement.click();
		 * Thread.sleep(5000); Set<String> windowHandles = driver.getWindowHandles(); //
		 * System.out.println(windowHandles.size()); Iterator<String> itr =
		 * windowHandles.iterator(); while (itr.hasNext()) {
		 * 
		 * // System.out.println(itr.next().toString()); String parentWindow =
		 * itr.next(); String secondWindow = itr.next();
		 * driver.switchTo().window(secondWindow);
		 * 
		 * Thread.sleep(5000); addToCartButton.click();}
		 */

	}

	public void addCart() throws Exception {
		Actions actions = new Actions(ApplicationController.instance.driver);
		// actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		searchElement.click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		// System.out.println(windowHandles.size());
		Iterator<String> itr = windowHandles.iterator();
		while (itr.hasNext()) {

			// System.out.println(itr.next().toString());
			String parentWindow = itr.next();
			String secondWindow = itr.next();
			driver.switchTo().window(secondWindow);

			Thread.sleep(5000);
			addToCartButton.click();
			//removeItem.click();
		}
	}

	
}
