package homeWork8.stepDefinitions;

import homeWork8.abstractClasses.BasePage;
import homeWork8.desktop.CommonAssertions;
import homeWork8.desktop.pages.CartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static homeWork8.constants.TextConstants.CART_TITLE;

public final class CartStepDefinitions extends BasePage {
    CartPage cartPage = new CartPage();
    CommonAssertions commonAssertions = new CommonAssertions();

    @And("The user is redirected to the Cart page")
    public void theUserIsRedirectedToCartPage() {
        commonAssertions.verifyPageIsOpen(CART_TITLE);
    }

    @And("The user can view order summary")
    public void theUserCanViewOrderSummary(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        rows.forEach(row -> cartPage.verifyEqualsValue(row));
    }

    @And("The user clicks on Check out in cart button")
    public void theUserClicksOnCheckOutInCartButton() {
        cartPage.clickCheckOutInCartButton();
    }
}

