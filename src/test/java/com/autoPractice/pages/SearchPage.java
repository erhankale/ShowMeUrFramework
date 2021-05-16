package com.autoPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy (xpath = "//a[contains(@id,'color_')]")
    public WebElement item1;
}
