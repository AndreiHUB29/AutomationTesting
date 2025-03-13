package Pages;

import HelperMethods.ElementsMethods;
import ObjectData.SignUpPageObjectData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage
{
    WebDriver driver;
    ElementsMethods elementsMethods;


    public SignUpPage(WebDriver driver)
    {

        this.driver =driver;
        this.elementsMethods =new ElementsMethods(driver);
        PageFactory.initElements(driver, this);

    }



    @FindBy(xpath ="//input[@id='sign-username']")
    WebElement signupUsernameField;

    @FindBy(xpath ="//input[@id='sign-password']")
    WebElement  signupPasswordField;


    @FindBy(xpath = "//button[@onclick='register()']")
    WebElement signupButton;


    @FindBy(xpath = "(//div[@class='modal-footer']//button[text()='Close' and @class='btn btn-secondary' and @data-dismiss='modal'])[2]")
    WebElement closeButtonSignUp;




    public void completeUserNameSignupField (SignUpPageObjectData data)
    {

        signupUsernameField.sendKeys(data.getUsername());

    }



    public void completePasswordSignupField (SignUpPageObjectData data)
    {

       signupPasswordField.sendKeys(data.getPassword());

    }





    public void clickonSignupButton()
    {
        elementsMethods.clickOnElement(signupButton);


    }



    public void clickoncloseButton2(){
       elementsMethods.clickOnElement(closeButtonSignUp);


    }


    public void acceptOk() {

        Alert ok =driver.switchTo().alert();
        ok.accept();

    }


}

