package com.saucedemo.stepDefinitions;

import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartStepDefs {
    @Then("Assert that the right items named {string} and {string} added to cart")
    public void assert_that_the_right_items_named_and_added_to_cart(String item, String item2) {
        String locator1 = "//div[text()='"+item+"']";
        String locator2 = "//div[text()='"+item2+"']";

        WebElement webElement1 = Driver.get().findElement(By.xpath(locator1));
        WebElement webElement2 = Driver.get().findElement(By.xpath(locator2));

        Assert.assertEquals(item,webElement1.getText());
        Assert.assertEquals(item2,webElement2.getText());
    }
}
