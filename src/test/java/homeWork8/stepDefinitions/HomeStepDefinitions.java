package homeWork8.stepDefinitions;

import homeWork8.constants.TextConstants;
import homeWork8.desktop.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;


public class HomeStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("An anonymous user opens Home page")
    public void anonymousUserOpensHomePage() {
        homePage.navigateToHomePage();
    }

    @And("The user searches for the product id {string}")
    public void theUserSearchesForTheProductId(String productId) {
        homePage.enterValueToSearchField(productId);
        homePage.clickSearchButton();
    }
}
