package Tests;

import Logger.LoggerUtility;
import Pages.HomePage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;

public class HomePageTest extends Hooks
{

    HomePage homePage;





    @Test


    public void metodaTest()
    {


         homePage=new HomePage(getDriver());
         homePage.clickOnPhone();
        LoggerUtility.infoTest("The user clicks on phone");
         homePage.clickOnLaptops();
        LoggerUtility.infoTest("The user clicks on laptops");
         homePage.clickOnMonitors();
        LoggerUtility.infoTest("The user clicks on monitors");


    }

}
