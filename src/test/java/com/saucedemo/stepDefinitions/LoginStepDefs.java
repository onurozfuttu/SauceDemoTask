package com.saucedemo.stepDefinitions;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("Navigate to {string}")
    public void navigate_to(String string) {
        Driver.get().get(string);
    }

    @When("Login with the valid credentials")
    public void login_with_the_valid_credentials() {
        loginPage.login();
    }
}
