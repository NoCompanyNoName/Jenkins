package tests;

import org.testng.annotations.Test;
import pages.BasketPage;
import pages.ItemPage;
import pages.MainPage;
import pages.ResultOfSearchPage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("ALL")
public class CreateTest extends BaseTest{
    private MainPage mainPage;
    private ResultOfSearchPage resultOfSearchPage;
    private ItemPage itemPage;
    private BasketPage basketPage;

    @Test (groups = {"Computer"})
    public void TestProducts() throws InterruptedException, IOException {
        FileReader reader = new FileReader("products.properties");
        Properties properties = new Properties();
        properties.load(reader);

        mainPage = openURL();

        mainPage.EnterItem(properties.getProperty("product_1"));
        resultOfSearchPage = mainPage.clickButtonFindItem();
        ;
        itemPage = resultOfSearchPage.clickOpenItem();
        basketPage = itemPage.clickBuyButton();
        basketPage.clickButtonCloseBasket();
    }
    @Test(groups = {"stove"})
    public void TestProducts2() throws InterruptedException, IOException {
        FileReader reader = new FileReader("products.properties");
        Properties properties = new Properties();
        properties.load(reader);

        mainPage = openURL();

        mainPage.EnterItem(properties.getProperty("product_2"));
        resultOfSearchPage = mainPage.clickButtonFindItem();
        ;
        itemPage = resultOfSearchPage.clickOpenItem();
        basketPage = itemPage.clickBuyButton();
        basketPage.clickButtonCloseBasket();
    }
    @Test(groups = {"cosmetics"})
    public void TestProducts3() throws InterruptedException, IOException {
        FileReader reader=new FileReader("products.properties");
        Properties properties=new Properties();
        properties.load(reader);

        mainPage = openURL();

        mainPage.EnterItem(properties.getProperty("product_3"));
        resultOfSearchPage = mainPage.clickButtonFindItem();;
        itemPage = resultOfSearchPage.clickOpenItem();
        basketPage = itemPage.clickBuyButton();
        basketPage.clickButtonCloseBasket();
    }
}
