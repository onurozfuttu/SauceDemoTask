package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage extends BasePage{
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement productSortContainer;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement cartChecker;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartButton;

    public void sortProduct(){
        Select select = new Select(productSortContainer);
        select.selectByIndex(3);
    }

    public void checkCart(){
        String itemNumberInCart = cartChecker.getText();
        Assert.assertEquals(itemNumberInCart,"2");
    }

    public void goToYourCartPage(){
        cartButton.click();
    }
}
