package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{

 WebDriver driver;
 ElementsMethods elementsMethods;

 public HomePage(WebDriver driver)
 {
        this.driver=driver;
        this.elementsMethods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);

 }


 @FindBy(xpath = "//*[@class = 'list-group-item'][2]")
 WebElement phoneSubcategories;


 @FindBy(xpath = "//*[@class = 'list-group-item'][3]")
 WebElement laptopsSubcategories;

 @FindBy(xpath = "//*[@class = 'list-group-item'][4]")
 WebElement monitorsSubcategories;



 @FindBy(xpath ="//a[@data-toggle='modal' and @data-target='#exampleModal']")
 WebElement contact;


 @FindBy(xpath ="//a[@data-toggle='modal' and @data-target='#videoModal']")
 WebElement aboutUS;


 @FindBy(xpath ="//a[@href='cart.html']")
 WebElement cart;


 @FindBy(xpath =" //a[@data-toggle='modal' and @data-target='#logInModal']")
 WebElement logIn;

 @FindBy(xpath =" //a[@data-toggle='modal' and @data-target='#signInModal']")
 WebElement signUp;




    public void clickOnPhone()
    {
      elementsMethods.clickOnElement(phoneSubcategories);
    }

  public void clickOnLaptops()
  {
   elementsMethods.clickOnElement(laptopsSubcategories);

  }

 public void clickOnMonitors()
 {
  elementsMethods.clickOnElement(monitorsSubcategories);

 }




 public void clickOnContact()
 {
  elementsMethods.clickOnElement(contact);

 }


 public void clickOnAboutUs()
 {
  elementsMethods.clickOnElement(aboutUS);

 }

 public void clickOnCart()
 {
  elementsMethods.clickOnElement(cart);

 }

 public void clickOnLogIn()
 {
  elementsMethods.clickOnElement(logIn);
 }

 public void clickOnSignUp()
 {
  elementsMethods.clickOnElement(signUp);
 }



}
