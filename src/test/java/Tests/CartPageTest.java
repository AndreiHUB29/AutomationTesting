package Tests;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import ObjectData.CartPageObjectData;
import ObjectData.ContactPageObjectData;
import Pages.CartPage;
import Pages.HomePage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.Map;

public class CartPageTest extends Hooks {

    HomePage homePage;
    CartPage cartpage;
    ElementsMethods elementsmethods;
    private Map<String, CartPageObjectData> cartPageObjectDataMap;




    @Test

    public void metodaTest()  {

        cartPageObjectDataMap= xmlReader.loadData("src/main/resources/CartPageData.xml", CartPageObjectData.class);
        CartPageObjectData data =cartPageObjectDataMap.get("dataSet_1");
        homePage = new HomePage(getDriver());
        cartpage=new CartPage(getDriver());
        elementsmethods=new ElementsMethods(getDriver());
        homePage.clickOnCart();
        LoggerUtility.infoTest("The user clicks on cart");
        cartpage.clickonPlaceOrderButton();
        LoggerUtility.infoTest("The user clicks on place order button");
        elementsmethods.pauseTestExecution();
        cartpage.completeNameForOrderField(data);
        LoggerUtility.infoTest("The user  completes name");
        cartpage.completecountryForOrder(data);
        LoggerUtility.infoTest("The user  completes country");
        cartpage.completecityForOrder(data);
        LoggerUtility.infoTest("The user  completes city");
        cartpage.completecardForOrder(data);
        LoggerUtility.infoTest("The user  completes card");
        cartpage.completemonthForOrder(data);
        LoggerUtility.infoTest("The user  completes month ");
        cartpage.completeyearForOrder(data);
        LoggerUtility.infoTest("The user  completes year ");
        cartpage.clickonpurchaseOrder();
        LoggerUtility.infoTest("The user clicks on purchase");
        cartpage.clickOnokButton();
        LoggerUtility.infoTest("The user clicks on ok button");
        cartpage.clickOnCloseButton1000();
        LoggerUtility.infoTest("The user clicks on close button");
        cartpage.clickOnDefaultPageButton();
        LoggerUtility.infoTest("The user clicks on default page button");













    }


}




