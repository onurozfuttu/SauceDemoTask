package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button']")
    public WebElement checkoutButton;

    public void clickCheckOutButton(){
        checkoutButton.click();
    }
}
