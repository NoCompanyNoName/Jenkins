package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultOfSearchPage extends BasePage{
    @FindBy(xpath ="(//a[contains(@class, 'goods-tile__heading')])[3]")
    public WebElement openItem;
    public ResultOfSearchPage(WebDriver driver) {
        super(driver);
    }
    public ItemPage clickOpenItem() {
        wait.until(ExpectedConditions.visibilityOf(openItem));
        openItem.click();
        return new ItemPage(driver);
    }
}
