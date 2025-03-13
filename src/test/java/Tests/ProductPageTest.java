package Tests;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import ObjectData.CartPageObjectData;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductPage;
import ShareDataBrowser.Hooks;
import ShareDataBrowser.ShareData;
import org.testng.annotations.Test;
import xmlReaderUtility.xmlReader;

import java.util.Map;

public class ProductPageTest extends Hooks {


    ProductPage productpage;
    HomePage homepage;
    CartPage cartpage;
    ElementsMethods elementsmethods;
    private Map<String, CartPageObjectData> productPageObjectDataMap;




    @Test

    public void metodaTest() {

        productPageObjectDataMap= xmlReader.loadData("src/main/resources/CartPageData.xml", CartPageObjectData.class);
        CartPageObjectData data =productPageObjectDataMap.get("dataSet_1");
        productpage= new ProductPage(getDriver());
        homepage= new HomePage(getDriver());
        cartpage =new CartPage(getDriver());
        elementsmethods= new ElementsMethods(getDriver());
        elementsmethods.pauseTestExecution();
        productpage.clickOnSamsungGalaxyS6();
        LoggerUtility.infoTest("The user clicks on samsung galaxy s6");
        elementsmethods.pauseTestExecution();
        productpage.clickOnaddToCartButton();
        LoggerUtility.infoTest("The user clicks on add cart");
        elementsmethods.pauseTestExecution();
        productpage.acceptOk();
        LoggerUtility.infoTest("The user clicks on ok");
        homepage.clickOnCart();
        LoggerUtility.infoTest("The user clicks on  cart");
        cartpage.clickonPlaceOrderButton();
        LoggerUtility.infoTest("The user clicks on  place order button");
        elementsmethods.pauseTestExecution();
        cartpage.completeNameForOrderField(data);
        LoggerUtility.infoTest("The user  completes name field");
        cartpage.completecountryForOrder(data);
        LoggerUtility.infoTest("The user  completes country field");
        cartpage.completecityForOrder(data);
        LoggerUtility.infoTest("The user completes city field");
        cartpage.completecardForOrder(data);
        LoggerUtility.infoTest("The user completes card field");
        cartpage.completemonthForOrder(data);
        LoggerUtility.infoTest("The user completes month field");
        cartpage.completeyearForOrder(data);
        LoggerUtility.infoTest("The user completes year field");
        cartpage.clickonpurchaseOrder();
        LoggerUtility.infoTest("The user clicks on  purchase");
        cartpage.clickOnokButton();
        LoggerUtility.infoTest("The user clicks on  ok");
        cartpage.clickOnCloseButton1000();
        LoggerUtility.infoTest("The user clicks on  close");
        cartpage.clickOnDefaultPageButton();
        LoggerUtility.infoTest("The user clicks on  default page button");


    }
}
