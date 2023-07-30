package com.saucedemo.stepDefinitions;

import com.saucedemo.pages.CheckoutOverviewPage;
import com.saucedemo.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStepDefs {
    CheckoutPage checkoutPage = new CheckoutPage();
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    @When("Go to checkout page and fill {string} and {string} and {string}")
    public void go_to_checkout_page_and_fill_the_form_and_fill_and_and(String firstname, String lastname, String postalCode) {
    checkoutPage.fillCheckOutInputBoxes(firstname,lastname,postalCode);
    }

    @Then("Assert the price of items")
    public void assert_the_price_of_items() {
        Assert.assertEquals(checkoutOverviewPage.sumPrices(),checkoutOverviewPage.convertTotalPriceToDouble(),0.001);
    }
}
