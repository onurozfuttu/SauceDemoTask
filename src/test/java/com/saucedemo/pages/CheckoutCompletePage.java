package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{
    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    public WebElement orderCompleteMessage;

    public String checkOutCompleteMessageCheck(){
        return orderCompleteMessage.getText();
    }
}
