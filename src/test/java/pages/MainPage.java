package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    @FindBy(xpath="//input[@name='search']")
    public WebElement searchField;
    @FindBy(xpath="//button[contains(text(), \"Знайти\")]")
    public WebElement buttonFindItem;

    public MainPage(WebDriver driver) {
        super(driver);

    }
    public void EnterItem(String item) {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(item);
    }
    public ResultOfSearchPage clickButtonFindItem() {
        wait.until(ExpectedConditions.visibilityOf(buttonFindItem));
        buttonFindItem.click();
        return new ResultOfSearchPage(driver);
    }


}
