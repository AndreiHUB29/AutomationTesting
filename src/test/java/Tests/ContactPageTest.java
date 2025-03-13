package Tests;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import ObjectData.ContactPageObjectData;
import ObjectData.LoginPageObjectData;
import Pages.ContactPage;
import Pages.HomePage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.Map;

public class ContactPageTest extends Hooks {


    HomePage homePage;
    ContactPage contactpage;
    ElementsMethods elementsmethods;
    private Map<String, ContactPageObjectData> contactPageObjectDataMap;




    @Test

    public void metodaTest() {

        contactPageObjectDataMap= xmlReader.loadData("src/main/resources/ContactPageData.xml", ContactPageObjectData.class);
        ContactPageObjectData data =contactPageObjectDataMap.get("dataSet_1");
        homePage = new HomePage(getDriver());
        contactpage =new ContactPage(getDriver());
        elementsmethods=new ElementsMethods(getDriver());
        homePage.clickOnContact();
        LoggerUtility.infoTest("The user clicks on contact");
        elementsmethods.pauseTestExecution();
        contactpage.completeContactEmailField(data);
        LoggerUtility.infoTest("The user completes contact email field");
        contactpage.completeContactNameField(data);
        LoggerUtility.infoTest("The user completes contact name field");
        contactpage.completeContactMessageTextField(data);
        LoggerUtility.infoTest("The user completes contact message field");
        //contactpage.clickoncloseButtonnn();
        contactpage.clickonSendMessageButton();
        LoggerUtility.infoTest("The user clicks on send message");
        contactpage.acceptOk();
        LoggerUtility.infoTest("The user clicks on ok");





    }
}
