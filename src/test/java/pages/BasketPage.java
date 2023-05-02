package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketPage extends BasePage{
    @FindBy(xpath="//button[@class='modal__close']")
    public WebElement buttonCloseBasket;

    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public void clickButtonCloseBasket() {
        wait.until(ExpectedConditions.visibilityOf(buttonCloseBasket));
        buttonCloseBasket.click();
    }

}
