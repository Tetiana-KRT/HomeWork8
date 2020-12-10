package homeWork8.desktop.pages;

import homeWork8.abstractClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class RegisterPage extends BasePage {

    @FindBy(xpath="//input[@id='guest.email']")
    static
    WebElement guestEmailInput;
    @FindBy(xpath="//input[@id='guest.confirm.email']")
    static
    WebElement confirmGuestEmailInput;
    @FindBy(xpath="//button[.='Check Out as a Guest']")
    static
    WebElement checkOutAsGuestButton;

    public static void setGuestEmail(String guestEmail)
    {
        setField(guestEmailInput, guestEmail);
    }

    public static void confirmGuestEmail(String guestEmail)
    {
        setField(confirmGuestEmailInput, guestEmail);
    }

    public static void clickCheckOutAsGuestButton()
    {
        clickButton(checkOutAsGuestButton);
    }
}


