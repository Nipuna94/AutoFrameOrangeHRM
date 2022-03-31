package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class LoginPageEvents {
    public void verifyLoginPageOpenedOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that login page open or not");
        Assert.assertTrue(elementFetch.getListWebElement("XPATH", LoginPageElements.loginText).size()>0, "Login page did not open");
    }

    public void enterUsername(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the username");
        elementFetch.getWebElement("ID",LoginPageElements.username).sendKeys("Admin");
    }

    public void enterPassword(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the password");
        elementFetch.getWebElement("ID",LoginPageElements.password).sendKeys("admin123");
    }

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on Log In button");
        elementFetch.getWebElement("ID", LoginPageElements.loginButton).click();
    }
}
