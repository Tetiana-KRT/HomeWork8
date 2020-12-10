package homeWork8.desktop.fragments;

import homeWork8.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.desktop.pages.CartPageOld;

import static homeWork8.constants.TextConstants.ADD_PRODUCT_TO_CART_TITLE;

public final class AddProductToCartPopup extends BasePage {

    @FindBy(xpath="//a[contains(text(),'Check Out')]")
    static
    WebElement checkOutButton;
    @FindBy(xpath="//div[@id='cboxTitle']//span[@class='headline-text']")
    static
    WebElement popupTitle;

    public void clickCheckOutButton()
    {
        clickButton(checkOutButton);
    }

    public static void verifyAddProductToCartPopupIsOpen()
    {
        Assert.assertTrue(popupTitle.getText().contains(ADD_PRODUCT_TO_CART_TITLE));
    }
}

