package com.autoPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath="//p[contains(.,'Welcome to your account.')]")
    public WebElement approvalText;
}
