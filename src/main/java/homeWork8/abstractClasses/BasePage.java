package homeWork8.abstractClasses;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObject.abstractClasses.PageObjectOld;

import static homeWork8.constants.TextConstants.SEARCH_RESULT_TITLE;
import static homeWork8.driver.WebDriverFactory.getDriver;

public class BasePage
{

    public BasePage()
    {
        PageFactory.initElements(getDriver(), this);
    }

    public Boolean isElementPresent(By locator)
    {
        return getDriver().findElements(locator).size() > 0;
    }

    public BasePage setField(By field, String value)
    {
        getDriver().findElement(field).sendKeys(value);
        return this;
    }
    public static void setField(WebElement field, String value)
    {
        field.sendKeys(value);
    }

    public static void clickButton(By locator)
    {
        getDriver().findElement(locator).click();
    }

    public static void clickButton(WebElement locator)
    {
        locator.click();
    }

}
