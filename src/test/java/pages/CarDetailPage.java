package pages;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.PropertyUtils;

import java.io.File;
import java.io.IOException;

public class CarDetailPage {
    WebDriver driver = Driver.getDriver(PropertyUtils.getProperty("browser"));

    public CarDetailPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@class='vehicle-info']//h1[position()=2]")
    public WebElement vehicleTitle;

    @FindBy(xpath = "//native-lead-form//button")
    public WebElement availabilityBtn;

    @FindBy(xpath = "//native-lead-form//input[@name='fname']")
    public WebElement firstNameField;

    @FindBy(xpath = "//native-lead-form//input[@name='lname']")
    public WebElement lastNameField;

    @FindBy(xpath = "//native-lead-form//input[@name='email']")
    public WebElement emailField;

    @FindBy(xpath = "//native-lead-form//input[@type='email']/following-sibling::p[@class='error-text']")
    public WebElement emailFieldErrorMsg;

    @FindBy(xpath = "//div[@class='vdp-pricing__container']")
    public WebElement paymentCalculator;

    public void validateCarInformation() {
        Assert.assertTrue(vehicleTitle.getText().contains("Honda Pilot Touring 8-Passenger"));
        Assert.assertTrue(availabilityBtn.isDisplayed());
    }

    public void contactSellerInformation() {
        firstNameField.sendKeys("Car");
        lastNameField.sendKeys("Owner");
        emailField.sendKeys("carowner@yahoo.com");
        availabilityBtn.click();
    }

    public void errorMessage() {
        Assert.assertTrue(emailFieldErrorMsg.isDisplayed());
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", paymentCalculator);
    }

    public void takeScreenshot(String testName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = "src/test/resources/screenshots/" + testName + System.currentTimeMillis() + ".png";
        File destScreenshot = new File(destination);
        FileUtils.copyFile(screenshot, destScreenshot);
        driver.quit();
    }
}
