package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends BasePage{
    @FindBy(xpath = "//div[@class='checkout_info']//input")
    public List<WebElement> checkoutInputBoxes;

    @FindBy(id = "continue")
    public WebElement continueButton;

    public void fillCheckOutInputBoxes(String firstname, String lastname, String postalCode){
        CartPage cartPage = new CartPage();
        cartPage.clickCheckOutButton();

        checkoutInputBoxes.get(0).sendKeys(firstname);
        checkoutInputBoxes.get(1).sendKeys(lastname);
        checkoutInputBoxes.get(2).sendKeys(postalCode);

        BrowserUtils.waitFor(5);
    }

    public void clickContinueButton(){
        continueButton.click();
    }
}
