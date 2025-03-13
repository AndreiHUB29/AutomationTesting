package Tests;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import ObjectData.LoginPageObjectData;
import ObjectData.SignUpPageObjectData;
import Pages.HomePage;
import Pages.SignUpPage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.Map;

public class SignUpPageTest extends Hooks {


    HomePage homePage;
    SignUpPage signuppage;
    ElementsMethods elementsmethods;
    private Map<String, SignUpPageObjectData> signUpPageObjectDataMap;



    @Test

    public void metodaTest() {

        signUpPageObjectDataMap= xmlReader.loadData("src/main/resources/SignUpPageData.xml", SignUpPageObjectData.class);
        SignUpPageObjectData data =signUpPageObjectDataMap.get("dataSet_1");
        homePage = new HomePage(getDriver());
        signuppage= new SignUpPage(getDriver());
        elementsmethods=new ElementsMethods(getDriver());
        homePage.clickOnSignUp();
        LoggerUtility.infoTest("The user clicks on  sign up");
        elementsmethods.pauseTestExecution();
        signuppage.completeUserNameSignupField(data);
        LoggerUtility.infoTest("The user completes user name sign up field");
        signuppage.completePasswordSignupField(data);
        LoggerUtility.infoTest("The user completes password sign up field");
        signuppage.clickonSignupButton();
        LoggerUtility.infoTest("The user clicks on  sign up");
        elementsmethods.pauseTestExecution();
        signuppage.acceptOk();
        LoggerUtility.infoTest("The user clicks on  ok");
        signuppage.clickoncloseButton2();
        LoggerUtility.infoTest("The user clicks on  close");


    }
}



