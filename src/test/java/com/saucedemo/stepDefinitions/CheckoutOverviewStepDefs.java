package com.saucedemo.stepDefinitions;

import com.saucedemo.pages.CheckoutPage;
import io.cucumber.java.en.When;

public class CheckoutOverviewStepDefs {

    @When("Click continue button and go to the checkout overview page")
    public void click_continue_button_and_go_to_the_checkout_overview_page() {
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickContinueButton();
    }
}
