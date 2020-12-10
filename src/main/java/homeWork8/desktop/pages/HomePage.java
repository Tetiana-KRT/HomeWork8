package homeWork8.desktop.pages;

import homeWork8.abstractClasses.BasePage;
import homeWork8.constants.TextConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homeWork8.driver.WebDriverFactory.getDriver;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='js-site-search-input']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='btn btn-link js_search_button']")
    WebElement searchButton;

    public void navigateToHomePage() {
        getDriver().get(TextConstants.URL);
    }

    public void enterValueToSearchField(String productId) {
        setField(searchField, productId);
    }

    public void clickSearchButton() {
        clickButton(searchButton);
    }
}
