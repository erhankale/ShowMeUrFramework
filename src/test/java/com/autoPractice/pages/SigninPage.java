package com.autoPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage{

    @FindBy(id="email")
    public WebElement inputEmail;

    @FindBy(id="passwd")
    public WebElement inputPass;

    @FindBy(id="SubmitLogin")
    public WebElement loginBtn;

    @FindBy(xpath="(//div[@class='alert alert-danger'])[1]")
    public WebElement errorMessage;
}
