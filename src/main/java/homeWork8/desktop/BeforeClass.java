package homeWork8.desktop;

import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.desktop.fragments.AddProductToCartPopupOld;
import pageObject.desktop.pages.*;

import java.util.concurrent.TimeUnit;

import static homeWork8.driver.WebDriverFactory.initializeDriver;

public class BeforeClass {
    @Before
    public void setUp() {
        initializeDriver();
    }
}
