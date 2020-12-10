package homeWork8.stepDefinitions;

import homeWork8.abstractClasses.BasePage;
import homeWork8.desktop.CommonAssertions;
import homeWork8.desktop.pages.OrderSummaryPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

import static homeWork8.constants.TextConstants.ORDER_SUMMARY_TITLE;
import static homeWork8.constants.TextConstants.REGISTER_TITLE;

public final class OrderSummaryStepDefinitions extends BasePage {
    OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
    CommonAssertions commonAssertions = new CommonAssertions();

    @And("The user is redirected to the Order summary page")
    public void theUserIsRedirectedToOrderSummaryPage() {
        commonAssertions.verifyPageIsOpen(ORDER_SUMMARY_TITLE);
    }

    @Then("The user can see the final order review")
    public void theUserCanSeeTheFinalOrderReview(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        rows.forEach(row -> orderSummaryPage.verifyFieldValueEqualsAmount(row));
    }
}


