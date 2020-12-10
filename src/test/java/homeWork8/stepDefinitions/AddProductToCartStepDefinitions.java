package homeWork8.stepDefinitions;

import homeWork8.abstractClasses.BasePage;
import homeWork8.desktop.fragments.AddProductToCartPopup;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.desktop.pages.CartPageOld;

import static homeWork8.constants.TextConstants.SEARCH_RESULT_TITLE;

public final class AddProductToCartStepDefinitions extends BasePage {
    AddProductToCartPopup addProductToCartPopup = new AddProductToCartPopup();

    @And("The user is redirected to Add product to cart popup")
    public void theUserIsRedirectedToPopup() {
        addProductToCartPopup.verifyAddProductToCartPopupIsOpen();
    }

    @And("The user clicks on Check out button")
    public void theUserClicksOnCheckOutButton() {
        addProductToCartPopup.clickCheckOutButton();
    }
}

