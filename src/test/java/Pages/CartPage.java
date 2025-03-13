package Pages;

import HelperMethods.ElementsMethods;
import ObjectData.CartPageObjectData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage
{

    WebDriver driver;
    ElementsMethods elementsMethods;


    public CartPage(WebDriver driver)
    {

        this.driver =driver;
        this.elementsMethods =new ElementsMethods(driver);
        PageFactory.initElements(driver, this);


    }




    @FindBy(xpath = "//button[@data-target='#orderModal']")
    WebElement placeOrderButton;


    @FindBy(xpath ="//input[@type='text' and @class='form-control' and @id='name']")
    WebElement nameForOrder;


    @FindBy(xpath ="//input[@type='text' and @id='country' and @class='form-control']")
    WebElement countryForOrder;

    @FindBy(xpath ="//input[@type='text' and @id='city' and @class='form-control']")
    WebElement cityForOrder;


    @FindBy(xpath ="//input[@type='text' and @id='card' and @class='form-control']")
    WebElement cardForOrder;

    @FindBy(xpath ="//input[@type='text' and @id='month' and @class='form-control']")
    WebElement monthForOrder;

    @FindBy(xpath ="//input[@type='text' and @id='year' and @class='form-control']")
    WebElement yearForOrder;

    @FindBy(xpath ="//button[@onclick='purchaseOrder()']")
    WebElement purchaseForOrder;


    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary' and text()='OK']")
    WebElement okButton;

    @FindBy(xpath = "(//div[@class='modal-footer']//button[text()='Close' and @class='btn btn-secondary' and @data-dismiss='modal'])[3]")
    WebElement clickOnCloseButtonincartpage;

    @FindBy(xpath = "//a[@id='nava' and @href='index.html']")
    WebElement clickondefaultpage;


    public void clickonPlaceOrderButton ()

    {
        elementsMethods.clickOnElement(placeOrderButton);

    }

    public void completeNameForOrderField (CartPageObjectData data)
    {

        nameForOrder.sendKeys(data.getName());
    }

    public void completecountryForOrder (CartPageObjectData data)
    {

        countryForOrder.sendKeys(data.getCountry());
    }


    public void completecityForOrder (CartPageObjectData data)
    {

        cityForOrder.sendKeys(data.getCity());
    }

    public void completecardForOrder (CartPageObjectData data)
    {

        cardForOrder.sendKeys(data.getCard());
    }

    public void completemonthForOrder (CartPageObjectData data)
    {

        monthForOrder.sendKeys(data.getMonth());
    }


    public void completeyearForOrder (CartPageObjectData data)
    {

        yearForOrder.sendKeys(data.getYear());
    }


    public void clickonpurchaseOrder()
    {
        elementsMethods.clickOnElement(purchaseForOrder);


    }




    public void clickOnokButton()
    {
        elementsMethods.clickOnElement(okButton);

    }

    public void clickOnCloseButton1000()
    {
        elementsMethods.clickOnElement(clickOnCloseButtonincartpage);

    }

    public void clickOnDefaultPageButton()
    {
        elementsMethods.clickOnElement(clickondefaultpage);

    }

}
