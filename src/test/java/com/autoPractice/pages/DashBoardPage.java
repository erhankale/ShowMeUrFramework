package com.autoPractice.pages;

import com.autoPractice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{

    public WebElement dashBoardBtns(String str){

        WebElement element = Driver.get().findElement(By.xpath("//*[contains(text(),'"+str+"')]"));

        return element;
    }

    @FindBy(id="search_query_top")
    public WebElement searchBox;

    @FindBy(xpath= "(//button[@type='submit'])[1]")
    public WebElement searchBtn;

}


