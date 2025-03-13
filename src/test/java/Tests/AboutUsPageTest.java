package Tests;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import Pages.AboutUsPage;
import Pages.HomePage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;

public class AboutUsPageTest extends Hooks {


    HomePage homePage;
    AboutUsPage aboutuspage;
    ElementsMethods elementsmethods;


    @Test

    public void metodaTest() {

        homePage = new HomePage(getDriver());
        aboutuspage=new AboutUsPage(getDriver());
        elementsmethods =new ElementsMethods(getDriver());
        homePage.clickOnAboutUs();
        LoggerUtility.infoTest("The user clicks on about us");
        elementsmethods.pauseTestExecution();
        aboutuspage.clickoncloseButtonField();
        LoggerUtility.infoTest("The user clicks on close button");



    }
}





