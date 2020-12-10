package homeWork8.desktop.pages;

import homeWork8.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.desktop.fragments.AddProductToCartPopupOld;

import static homeWork8.constants.TextConstants.PRODUCT_DETAILS_TITLE;
import static homeWork8.driver.WebDriverFactory.getDriver;

public final class ProductDetailsPage extends BasePage {

    @FindBy(xpath="//button[@id='addToCartButton']")
    WebElement addToCartButton;

    public void clickAddToCartButton()
    {
        clickButton(addToCartButton);
    }

}
