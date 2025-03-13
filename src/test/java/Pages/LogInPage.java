package Pages;

import HelperMethods.ElementsMethods;
import ObjectData.LoginPageObjectData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage

{

WebDriver driver;
ElementsMethods elementsMethods;



 public LogInPage(WebDriver driver)
 {
  this.driver =driver;
  this.elementsMethods =new ElementsMethods(driver);
     PageFactory.initElements(driver, this);


 }



    @FindBy(xpath = "//input[@type='text' and @id='loginusername' and @class='form-control']")
    WebElement loginUsernameField;

    @FindBy(xpath = "//input[@type='password' and @id='loginpassword' and @class='form-control']")
    WebElement loginPasswordField;


    @FindBy(xpath = "//button[@type='button' and @class='btn btn-primary' and @onclick='logIn()']")
    WebElement loginButton;


    @FindBy(xpath = "(//div[@class='modal-footer']//button[text()='Close' and @class='btn btn-secondary' and @data-dismiss='modal'])[3]")
    WebElement closeButton;




    public void completeUserNameLoginField (LoginPageObjectData data)
    {

        loginUsernameField.sendKeys( data.getUsername());




    }




    public void completePasswordLoginField (LoginPageObjectData data)
    {

        loginPasswordField.sendKeys(data.getPassword());

    }





    public void clickonloginButton()
    {
        elementsMethods.clickOnElement(loginButton);


    }



    public void clickoncloseButton1(){
        elementsMethods.clickOnElement(closeButton);


    }


    public void acceptOk() {

        Alert ok =driver.switchTo().alert();
        ok.accept();

    }


}
