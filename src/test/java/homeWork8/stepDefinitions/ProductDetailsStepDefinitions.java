package homeWork8.stepDefinitions;

import homeWork8.abstractClasses.BasePage;
import homeWork8.desktop.CommonAssertions;
import homeWork8.desktop.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homeWork8.constants.TextConstants.PRODUCT_DETAILS_TITLE;
import static homeWork8.constants.TextConstants.SEARCH_RESULT_TITLE;

public final class ProductDetailsStepDefinitions extends BasePage {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    static CommonAssertions commonAssertions = new CommonAssertions();

    @And("The user clicks on Add to cart button")
    public void theUserClicksOnAddToCartButton() {
        productDetailsPage.clickAddToCartButton();
    }

    @And("The user is redirected to the Product details page")
    public static void theUserIsRedirectedToProgramDetailsPage() {
        commonAssertions.verifyPageIsOpen(PRODUCT_DETAILS_TITLE);
    }
}
