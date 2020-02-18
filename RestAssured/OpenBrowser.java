package APITEST1.ING_HACK_DAY1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ReadDataFromProperty;
import generic_libraries.ReadData;

public class OpenBrowser {

	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// check for the git diff
	}

	@Test
	public void openBrowserTest() throws Exception {
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();

		driver.manage().window().maximize();

		String envUrl = ReadDataFromProperty.getproper("url");

		driver.get(envUrl);

		long wt = Long.parseLong(ReadDataFromProperty.getproper("iw"));

		driver.manage().timeouts().implicitlyWait(wt, TimeUnit.SECONDS);

	}

	@Test
    public void navigateToNewCustomerPage()
    {
    	driver.findElement(By.xpath("//span[contains(text(),'Save')]")).wa
    	
    }

}
