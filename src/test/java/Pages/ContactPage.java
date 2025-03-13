package Pages;

import HelperMethods.ElementsMethods;
import ObjectData.ContactPageObjectData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage
{

    WebDriver driver;
    ElementsMethods elementsMethods;


    public ContactPage(WebDriver driver)
    {
        this.driver =driver;
        this.elementsMethods =new ElementsMethods(driver);
        PageFactory.initElements(driver, this);

    }





    @FindBy(xpath="//input[@id='recipient-email']")
    WebElement recipientEmailField;

    @FindBy(xpath = "//input[@type='text' and @id='recipient-name' and @class='form-control']")
    WebElement contactnameField;


    @FindBy(xpath="//textarea[@id='message-text']")
    WebElement messageTextField;

    @FindBy(xpath="//button[text()='Send message']")
    WebElement sendMessageButton;


    @FindBy(xpath = "(//div[@class='modal-footer']//button[text()='Close' and @class='btn btn-secondary' and @data-dismiss='modal'])[1]")
    WebElement closeButton;




    public void completeContactEmailField (ContactPageObjectData data)
    {

        recipientEmailField.sendKeys(data.getContactemail());


    }

    public void completeContactNameField (ContactPageObjectData data)
    {

        contactnameField.sendKeys(data.getContactname());


    }
    public void completeContactMessageTextField (ContactPageObjectData data)
    {

        messageTextField.sendKeys(data.getContactmessage());


    }

    public void clickonSendMessageButton()
    {
        elementsMethods.clickOnElement(sendMessageButton);


    }

    public void clickoncloseButtonnn(){
        elementsMethods.clickOnElement(closeButton);


    }

     public void acceptOk() {

         Alert ok=driver.switchTo().alert();
         ok.accept();

}



}
