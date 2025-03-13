package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage
{


    WebDriver driver;
    ElementsMethods elementsMethods;


    public ProductPage(WebDriver driver)
    {
        this.driver =driver;
        this.elementsMethods =new ElementsMethods(driver);
        PageFactory.initElements(driver, this);

    }



    @FindBy(xpath ="//a[@href='prod.html?idp_=1' and @class='hrefch']")
    WebElement samsungGalaxyS6;

    @FindBy(xpath = "//a[@onclick='addToCart(1)']")
    WebElement addToCartButton;




    public void clickOnSamsungGalaxyS6()
    {
        elementsMethods.clickOnElement(samsungGalaxyS6);

    }

    public void clickOnaddToCartButton()
    {
        elementsMethods.clickOnElement(addToCartButton);

    }

    public void acceptOk() {

        Alert ok =driver.switchTo().alert();
        ok.accept();

    }



}
