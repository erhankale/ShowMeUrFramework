package com.autoPractice.pages;

import com.autoPractice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends BasePage{

    public WebElement dashBoardBtns(String str){

        WebElement element = Driver.get().findElement(By.xpath("//*[contains(text(),'"+str+"')]"));

        return element;
    }


}


