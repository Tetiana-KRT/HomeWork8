package homeWork8.desktop;

import homeWork8.abstractClasses.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static homeWork8.driver.WebDriverFactory.getDriver;

public class CommonAssertions extends BasePage {
    public static void verifyFieldEquals(WebElement field, String value)
    {
        Assert.assertEquals(value, field.getText());
    }

    public static void verifyFieldContains(WebElement field, String value)
    {
        Assert.assertTrue(field.getText().contains(value));
    }

    public static void verifyPageIsOpen(String title)
    {
        Assert.assertTrue(getDriver().getTitle().contains(title));
    }
}
