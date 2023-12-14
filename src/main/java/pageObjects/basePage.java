package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import testManager.UsefullMethods;

public class basePage {

    public WebDriver driver;
    public UsefullMethods usefullMethods;

    public basePage (WebDriver driver) {
         this.driver = driver;
         this.usefullMethods = new UsefullMethods(driver);
         PageFactory.initElements(driver,this);

     }
}
