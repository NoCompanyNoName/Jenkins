package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainPage;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void initBrowser() {
        WebDriverManager.chromedriver().arch64().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("disable-notifications");
        driver = new ChromeDriver(options);
    }
    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    public MainPage openURL() {
        driver.get("https://rozetka.com.ua/ua/");
        return new MainPage(driver);
    }
}
