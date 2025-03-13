package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage {

    WebDriver driver;
    ElementsMethods elementsMethods;


    public AboutUsPage(WebDriver driver)
    {
        this.driver =driver;
        this.elementsMethods =new ElementsMethods(driver);

        PageFactory.initElements(driver, this);

    }




    @FindBy(xpath = "(//div[@class='modal-footer']//button[text()='Close' and @class='btn btn-secondary' and @data-dismiss='modal'])[4]")
    WebElement closeButtonField;




    public void clickoncloseButtonField()
   {


            elementsMethods.clickOnElement(closeButtonField);

    }



}
