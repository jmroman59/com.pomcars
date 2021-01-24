package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CarDetailPage;
import pages.HomePage;
import pages.HondaSearchPage;
import utilities.Condition;
import utilities.Driver;
import utilities.PropertyUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver driver = Driver.getDriver(PropertyUtils.getProperty("browser"));
    HomePage homePage = new HomePage();
    HondaSearchPage hondaSearchPage = new HondaSearchPage();
    CarDetailPage carDetailPage = new CarDetailPage();

    @Given("User navigates to {string} application")
    public void userNavigatesToApplication(String URL) {
        driver.navigate().to(PropertyUtils.getProperty(URL));
    }

    @When("User enters car search {string} specification")
    public void userEntersCarSearchSpecification(String carInformation) {
        homePage.selectStockType(carInformation);
        homePage.selectCarMake(carInformation);
        homePage.selectCarModel(carInformation);
        homePage.selectCarPrice(carInformation);
        homePage.selectCarRadius(carInformation);
        homePage.enterZip(carInformation);
        driver.manage().deleteAllCookies();
        homePage.searchBtn.click();
    }

    @Then("User validate filters are displayed")
    public void userValidateFiltersAreDisplayed() {
        hondaSearchPage.validateFilterTags();
    }

    @Given("User click on new car filter")
    public void userClickOnNewCarFilter() {
        driver.manage().deleteAllCookies();
        hondaSearchPage.newRadioBtn.click();
    }

    @Then("User validate new filter is displayed")
    public void userValidateNewFilterIsDisplayed() {
        hondaSearchPage.validateNewCarFilter();
    }

    @Given("User click on trim type checkbox")
    public void userClickOnTrimTypeCheckbox() {
        hondaSearchPage.trimTypeBtn.click();
    }

    @Then("User validate trim tag is displayed")
    public void userValidateTrimTagIsDisplayed() {
        hondaSearchPage.validateTrimFilter();
    }

    @Given("User click on second car")
    public void userClickOnSecondCar() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        hondaSearchPage.secondOption.click();
    }

    @Then("User validate information is displayed")
    public void userValidateInformationIsDisplayed() {
        carDetailPage.validateCarInformation();
    }

    @Given("User enters invalid contact information")
    public void user_enters_invalid_contact_information() {
        carDetailPage.contactSellerInformation();
    }

    @Then("User is able to see error message")
    public void user_is_able_to_see_error_message() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        carDetailPage.errorMessage();
    }

    @Given("User scrolls down to view payment calculator")
    public void user_scrolls_down_to_view_payment_calculator() {
        carDetailPage.scrollDown();
    }

    @Then("User takes a screenshot")
    public void user_takes_a_screenshot() throws IOException {
        carDetailPage.takeScreenshot("test1");
    }
}
