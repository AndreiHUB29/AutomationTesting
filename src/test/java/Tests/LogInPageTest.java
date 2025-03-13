package Tests;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import ObjectData.LoginPageObjectData;
import Pages.HomePage;
import Pages.LogInPage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.Map;

public class LogInPageTest extends Hooks {


    HomePage homePage;
    LogInPage loginpage;
    ElementsMethods elementsmethods;
    private Map<String, LoginPageObjectData> loginPageObjectDataMap;



    @Test

    public void metodaTest() {

        loginPageObjectDataMap= xmlReader.loadData("src/main/resources/LoginPageData.xml", LoginPageObjectData.class);
        LoginPageObjectData data =loginPageObjectDataMap.get("dataSet_1");
        homePage = new HomePage(getDriver());
        loginpage=new LogInPage(getDriver());
        elementsmethods=new ElementsMethods(getDriver());
        homePage.clickOnLogIn();
        LoggerUtility.infoTest("The user clicks on log in");
        elementsmethods.pauseTestExecution();
        loginpage.completeUserNameLoginField(data);
        LoggerUtility.infoTest("The user completes user name log in field");
        loginpage.completePasswordLoginField(data);
        LoggerUtility.infoTest("The user completes password log in field");
        loginpage.clickonloginButton();
        LoggerUtility.infoTest("The user clicks on log in");
        elementsmethods.pauseTestExecution();
        loginpage.acceptOk();
        LoggerUtility.infoTest("The user clicks on ok");
        loginpage.clickoncloseButton1();
        LoggerUtility.infoTest("The user clicks on close");

    }
}