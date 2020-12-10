package homeWork8.stepDefinitions;

import homeWork8.abstractClasses.BasePage;
import homeWork8.desktop.CommonAssertions;
import homeWork8.desktop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homeWork8.constants.TextConstants.REGISTER_TITLE;

public final class RegisterStepDefinitions extends BasePage {
    RegisterPage registerPage = new RegisterPage();
    CommonAssertions commonAssertions = new CommonAssertions();

    @And("The user enters a guest e-mail address {string}")
    public void theUserEntersEmailAddress(String emailAddress) {
        registerPage.setGuestEmail(emailAddress);
    }

    @And("The user confirms a guest e-mail address {string}")
    public void theUserConfirmsEmailAddress(String emailAddress) {
        registerPage.confirmGuestEmail(emailAddress);
    }

    @And("The user is redirected to the Register page")
    public void theUserIsRedirectedToRegisterPage() {
        commonAssertions.verifyPageIsOpen(REGISTER_TITLE);
    }

    @When("The user clicks on the Check out as guest button")
    public void theUserClicksOnTheCheckOutAsGuestButton() {
        registerPage.clickCheckOutAsGuestButton();
    }
}


