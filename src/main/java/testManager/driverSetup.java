package testManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class driverSetup {

  public static WebDriver driver ;

  public static WebDriver initialize_Driver () {

    driver = new ChromeDriver(driverOptions.getOptions()) ;
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IDriver.IMP_WAIT));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(IDriver.PAGE_WAIT));
    driver.manage().window().maximize();
    return getDriver () ;
  }

  public static WebDriver getDriver () {
    return driver ;
  }

}
