package testManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class baseTest {

    public static WebDriver driver ;

    @Before
    public void setUp () {
       driver = driverSetup.initialize_Driver();
    }

    public static void navigateToUrl(String url) {
        driver.get(url);
    }

    @After
    public void tearDown () {
        if (driver != null){
            driver.quit();
        }
    }

}
