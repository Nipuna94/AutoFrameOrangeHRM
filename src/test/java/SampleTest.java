package test.java;

import main.java.pageEvents.HomePageEvents;

import main.java.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
    @Test
    public void sampleMethodForEmailEntering(){
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageOpenedOrNot();
        loginPageEvents.enterUsername();
        loginPageEvents.enterPassword();
        loginPageEvents.clickOnSignInButton();

        HomePageEvents HomePageEvents = new HomePageEvents();
        HomePageEvents.verifyHomePageOpenedOrNot();
    }
}
