package com.saucedemo.stepDefinitions;

import com.saucedemo.pages.CheckoutCompletePage;
import com.saucedemo.pages.CheckoutOverviewPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutCompleteStepDefs {
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Then("Click finish and assert the success shopping message {string}")
    public void click_finish_and_assert_the_success_shopping_message(String string) {
        checkoutOverviewPage.clickFinishButton();
        Assert.assertEquals(checkoutCompletePage.checkOutCompleteMessageCheck(),string);
    }
}
