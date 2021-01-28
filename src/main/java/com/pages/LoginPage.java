package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    //1. By Locators
    private By emailId = By.id("email");
    private By password = By.id("passwd");
    private By singInButton = By.id("SubmitLogin");
    private By forgotPwdLnk = By.linkText("Forgot your password?");
    // 2. Constructor of the page class

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    // 3. page actions : features(behavior) of the page the form of methods
    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean isForgotPwdLinkPresent(){
        return driver.findElement(forgotPwdLnk).isDisplayed();
    }

    public void enterUserName(String userName){
        driver.findElement(emailId).sendKeys(userName);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLogin(){
        driver.findElement(singInButton).click();
    }
}
