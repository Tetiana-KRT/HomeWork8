package homeWork8.stepDefinitions;

import homeWork8.abstractClasses.BasePage;
import homeWork8.desktop.CommonAssertions;
import homeWork8.desktop.pages.SearchResultPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static homeWork8.constants.TextConstants.SEARCH_RESULT_TITLE;

public final class SearchResultStepDefinitions extends BasePage {
    SearchResultPage searchResultPage = new SearchResultPage();
    static CommonAssertions commonAssertions = new CommonAssertions();

    @And("The user clicks on the product with the product id {string}")
    public void theUserClicksOnTheProduct(String productId) {
        searchResultPage.openProductDetails(productId);
    }

    @And("The user is redirected to the Search result page")
    public static void theUserIsRedirectedToSearchResultPage() {
        commonAssertions.verifyPageIsOpen(SEARCH_RESULT_TITLE);
    }
}
