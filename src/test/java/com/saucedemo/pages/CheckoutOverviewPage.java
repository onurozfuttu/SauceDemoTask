package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPage extends BasePage{

    @FindBy(xpath = "//div[@class='cart_list']//div[@class='inventory_item_price']")
    public List<WebElement> itemPrices;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    public WebElement totalPrice;

    @FindBy(xpath = "//button[@id='finish']")
    public WebElement finishButton;

    public double sumPrices(){
        double total = 0;
        for (WebElement itemPrice : itemPrices) {
            String strNum = itemPrice.getText();
            strNum = strNum.replace("$","");
            total += Double.parseDouble(strNum);
        }
        return total;
    }

    public double convertTotalPriceToDouble(){
        String totalPriceStr = totalPrice.getText();
        totalPriceStr = totalPriceStr.replace("Item total: $","");
        double result = Double.parseDouble(totalPriceStr);
        return result;
    }

    public void clickFinishButton(){
        finishButton.click();
    }
}
