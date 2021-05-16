package com.autoPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy (xpath = "//div[@class='product-image-container']")
    public WebElement item1;
}
