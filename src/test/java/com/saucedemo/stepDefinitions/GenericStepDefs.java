package com.saucedemo.stepDefinitions;

import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GenericStepDefs {

    @Then("Validate current page by page title {string}")
    public void validate_current_page_by_page_title(String string) {
        String locator = "//span[text()='"+string+"']";
        WebElement webElement = Driver.get().findElement(By.xpath(locator));
        Assert.assertEquals(string,webElement.getText());
    }
}
