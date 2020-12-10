package homeWork8.desktop.pages;

import homeWork8.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.abstractClasses.BasePageOld;

import static homeWork8.constants.TextConstants.SEARCH_RESULT_TITLE;
import static homeWork8.driver.WebDriverFactory.getDriver;

public final class SearchResultPage extends BasePage {

    private static By productInSearchResult (String productId){
        return By.xpath(String.format("//a[@class='product__list--name'][contains(@href, '%s')]", productId));
    }

    public static void openProductDetails(String productId)
    {
        clickButton(productInSearchResult(productId));
    }

}
