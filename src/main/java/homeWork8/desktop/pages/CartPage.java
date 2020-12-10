package homeWork8.desktop.pages;

import homeWork8.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static homeWork8.constants.TextConstants.CART_TITLE;
import static homeWork8.desktop.CommonAssertions.verifyFieldEquals;
import static homeWork8.driver.WebDriverFactory.getDriver;

public final class CartPage extends BasePage {

    @FindBy(xpath="//div[@class='col-xs-6 cart-totals-right text-right']")
    static
    WebElement subtotal;
    @FindBy(xpath="//div[@class='col-xs-6 cart-totals-right text-right grand-total']")
    static
    WebElement total;
    @FindBy(xpath="//div[@class='cart__actions']//button[contains(text(),'Check Out')]")
    static
    WebElement checkOutButtonInCart;

    public static void verifyEqualsValue(Map<String,String> map)
    {
        map.forEach((k,v) -> verifyFieldEquals(getTotalByType(k),v));
    }

    private static WebElement getTotalByType(String totalType){
        switch (totalType) {
            case "Total":
                return total;
            default:
                return subtotal;
        }
    }

    public void clickCheckOutInCartButton()
    {
        clickButton(checkOutButtonInCart);
    }
}

