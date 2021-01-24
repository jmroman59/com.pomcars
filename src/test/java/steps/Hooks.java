package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.PropertyUtils;

import java.util.concurrent.TimeUnit;

public class Hooks {
    WebDriver driver = Driver.getDriver(PropertyUtils.getProperty("browser"));

    @Before
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
