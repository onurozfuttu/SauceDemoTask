package com.saucedemo.pages;

import com.saucedemo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "user-name")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void login(){
        usernameInputBox.sendKeys(ConfigurationReader.get("username"));
        passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }
}
