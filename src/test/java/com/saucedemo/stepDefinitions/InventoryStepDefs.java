package com.saucedemo.stepDefinitions;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class InventoryStepDefs {
    InventoryPage inventoryPage = new InventoryPage();

    @When("Sort the products high to low")
    public void sort_the_products_high_to_low() {
        inventoryPage.sortProduct();
        BrowserUtils.waitFor(5);
    }

    @When("Add to cart at least two item {string} and {string}")
    public void add_to_cart_at_least_two_item_and(String firstItem, String secondItem) {
        String locator1 = "//div[text()='"+firstItem+"']/../../../div[2]//button";
        String locator2 = "//div[text()='"+secondItem+"']/../../../div[2]//button";

        Driver.get().findElement(By.xpath(locator1)).click();
        Driver.get().findElement(By.xpath(locator2)).click();
    }

    @Then("Assert that the basket shows the true number of product")
    public void assert_that_the_basket_shows_the_true_number_of_product() {
        inventoryPage.checkCart();
    }

    @When("Navigate to Your Cart page")
    public void navigate_to_your_cart_page() {
        inventoryPage.goToYourCartPage();
    }
}
