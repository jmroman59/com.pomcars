package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Condition;
import utilities.Driver;
import utilities.PropertyUtils;

public class HomePage {
    WebDriver driver = Driver.getDriver(PropertyUtils.getProperty("browser"));
    Condition condition = new Condition();

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@name='stockType']")
    public WebElement stockType;

    @FindBy(xpath = "//select[@name='makeId']")
    public WebElement makeId;

    @FindBy(xpath = "//select[@name='modelId']")
    public WebElement modelId;

    @FindBy(xpath = "//select[@name='priceMax']")
    public WebElement priceMax;

    @FindBy(xpath = "//select[@name='radius']")
    public WebElement radius;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchBtn;

    public void selectStockType(String value) {
        Select select = new Select(stockType);
        select.selectByVisibleText(condition.getCarStockType(value));
    }

    public void selectCarMake(String value) {
        Select select = new Select(makeId);
        select.selectByVisibleText(condition.getCarMake(value));
    }

    public void selectCarModel(String value) {
        Select select = new Select(modelId);
        select.selectByVisibleText(condition.getCarModel(value));
    }

    public void selectCarPrice(String value) {
        Select select = new Select(priceMax);
        select.selectByVisibleText(condition.getCarPrice(value));
    }

    public void selectCarRadius(String value) {
        Select select = new Select(radius);
        select.selectByVisibleText(condition.getCarRadius(value));
    }

    public void enterZip(String value) {
        zip.clear();
        zip.sendKeys(condition.getCarZip(value));
    }
}
