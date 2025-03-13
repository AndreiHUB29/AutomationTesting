package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsMethods


{

        WebDriver driver;

        public ElementsMethods(WebDriver driver)
        {
            this.driver =driver;


        }




     public void clickOnElement(WebElement element)
     {
            element.click();

     }

     public void pauseTestExecution(){

         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }





}
