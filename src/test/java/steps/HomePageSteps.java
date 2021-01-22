package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.Driver;
import utilities.PropertyUtils;

public class HomePageSteps {
    WebDriver driver = Driver.getDriver(PropertyUtils.getProperty("browser"));
    HomePage homePage = new HomePage();

    @Given("User navigates to {string} application")
    public void userNavigatesToApplication(String URL) {
        driver.navigate().to(PropertyUtils.getProperty(URL));
    }

    @Given("User enters car search {string} specification")
    public void user_enters_car_search_specification(String carInformation) {
        homePage.selectStockType(carInformation);
        homePage.selectCarMake(carInformation);
        homePage.selectCarModel(carInformation);
        homePage.selectCarPrice(carInformation);
        homePage.selectCarRadius(carInformation);
        homePage.enterZip(carInformation);
        homePage.searchBtn.click();
    }

    @Then("User click search")
    public void user_click_search() {

    }
}
