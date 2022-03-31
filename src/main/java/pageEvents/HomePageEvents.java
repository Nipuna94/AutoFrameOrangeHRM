package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class HomePageEvents {
    public void verifyHomePageOpenedOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that Home page open or not");
        Assert.assertTrue(elementFetch.getListWebElement("XPATH", HomePageElements.HomePageText).size()>0, "Home page did not open");
    }

}
