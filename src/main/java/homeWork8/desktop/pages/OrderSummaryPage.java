package homeWork8.desktop.pages;

import homeWork8.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static homeWork8.constants.TextConstants.ORDER_SUMMARY_TITLE;
import static homeWork8.desktop.CommonAssertions.verifyFieldContains;

public final class OrderSummaryPage extends BasePage {

    @FindBy(xpath="//div[@class='subtotal']//span")
    static
    WebElement subtotalValue;
    @FindBy(xpath="//div[@class='totals']//span")
    static
    WebElement totalValue;
    @FindBy(xpath="//div[@class='realTotals']//p")
    static
    WebElement taxValue;

    public static void verifyFieldValueEqualsAmount(Map<String,String> map)
    {
        map.forEach((k,v) -> verifyFieldContains(getTotalTypeByType(k),v));
    }

    private static WebElement getTotalTypeByType(String totalType){
        switch (totalType) {
            case "Total":
                return totalValue;
            case "Tax":
                return taxValue;
            default:
                return subtotalValue;
        }
    }
}


