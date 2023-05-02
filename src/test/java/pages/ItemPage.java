package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemPage extends BasePage{
   @FindBy(xpath = "//button[contains(@class, 'buy-button button')]")
    public WebElement buyButton;

    public ItemPage(WebDriver driver) {
        super(driver);
    }
    public BasketPage clickBuyButton() {
        wait.until(ExpectedConditions.visibilityOf(buyButton));
        buyButton.click();
        return new BasketPage(driver);
    }
}
