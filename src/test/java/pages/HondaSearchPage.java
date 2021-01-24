package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Condition;
import utilities.Driver;
import utilities.PropertyUtils;

import java.util.List;

public class HondaSearchPage {

    WebDriver driver = Driver.getDriver(PropertyUtils.getProperty("browser"));
    Condition condition = new Condition();

    public HondaSearchPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header//ul[@class='breadcrumbs']/li[position()>1]")
    public List<WebElement> filterTags;

    @FindBy(xpath = "//header//ul[@class='breadcrumbs']/li[contains(@data-dtm, '\"value\":\"New\"')]")
    public WebElement newFilterTag;

    @FindBy(xpath = "//input[@name='stkTypId']/parent::li/parent::ul/li[2]")
    public WebElement newRadioBtn;

    @FindBy(xpath = "//ul[@class='refinements']//*[contains(text(),'Touring 8-Passenger')]")
    public WebElement trimTypeBtn;

    @FindBy(xpath = "//div[@class='shop-srp-listings__listing-container'][position()=2]/a/div/div[1]")
    public WebElement secondOption;

    public String validate() {
        String conditions = "";
        for (WebElement filter: filterTags) {
            conditions += " " + filter.getText();
        }
        return conditions.trim();
    }

    public void validateFilterTags() {
        Assert.assertTrue(validate().toLowerCase().contains(condition.getCarMake("carInformation").toLowerCase()));
        Assert.assertTrue(validate().toLowerCase().contains(condition.getCarModel("carInformation").toLowerCase()));
        Assert.assertTrue(validate().toLowerCase().contains(condition.getCarPrice("carInformation").toLowerCase()));
        Assert.assertTrue(validate().toLowerCase().contains(condition.getCarStock("carInformation").toLowerCase()));
    }

    public void validateNewCarFilter() {
        Assert.assertTrue(newFilterTag.isDisplayed());
        Assert.assertFalse(validate().contains("Used"));
    }

    public void validateTrimFilter() {
        Assert.assertTrue(newFilterTag.isDisplayed());
        Assert.assertFalse(validate().contains("Touring 8-Passenger"));
    }


}
