package Flipkart_Project.Test_Scripts;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Flipkart.appRelated.ApplicationBaseClass;
import Flipkart.appRelated.ApplicationController;
import Flipkart_Project.PageObjects.FlipkartHomepage;
import Flipkart_Project.PageObjects.FlipkartHomepageImplementation;






public class BaseTestClassMyApplication extends ApplicationBaseClass{
   
	
	FlipkartHomepage homepage;
    

    @BeforeClass
    public void setUp() throws Exception {
    	ApplicationController.instance.start();
        switch (ApplicationController.browserType) {
            case CHROME:
            	homepage = new FlipkartHomepageImplementation(driver());
            	break;
            
        }
    }

	/*
	 * @AfterClass public void tearDown() { ApplicationController.instance.stop(); }
	 */
}
