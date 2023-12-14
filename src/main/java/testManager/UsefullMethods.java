package testManager;



import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsefullMethods {
   private WebDriver driver;
   private WebDriverWait wait ;

   public UsefullMethods(WebDriver driver){
       this.driver = driver ;

   }


    public void clickElement (WebElement element) {
        if (element.isDisplayed())
            element.click();
    }

    public void sendKeys (WebElement element,String text) {
        if (element.isDisplayed())
            element.click() ;
            element.sendKeys(text);

    }

    public void hoverOver (WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void assertion (WebElement actual,String expected) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message: " + actual.getText());

    }


}
