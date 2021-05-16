package com.autoPractice.pages;

import com.autoPractice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{

    @FindBy(id="quantity_wanted")
    public WebElement quantityBox;

    @FindBy(id="group_1")
    public WebElement sizeSelection;

    @FindBy(xpath="//a[@title='Black']")
    public WebElement color;

    @FindBy(xpath="//button[@name='Submit']")
    public WebElement addBtn;

    @FindBy(xpath="//*[contains(text(),'In stock')]")
    public WebElement stockIcon;

    @FindBy(xpath="//a[contains(@title,'Proceed')]")
    public WebElement proceedBtn;

    @FindBy(xpath="(//*[contains(text(),'Proceed')])[2]")
    public WebElement proceedBtn2;

    @FindBy(id="addressesAreEquals")
    public WebElement addressCheckBox;

    @FindBy(id="cgv")
    public WebElement termsCheckBox;

    @FindBy(xpath = "//*[contains(text(),'I confirm my order')]")
    public WebElement confirmBtn;

    @FindBy(css="p.alert.alert-success")
    public WebElement orderConfirmationMessage;

    public WebElement selectColor(String str){

        WebElement element = Driver.get().findElement(By.xpath("//a[@title='"+str+"']"));

        return element;
    }

    public WebElement selectPayment(String str){

        WebElement element = Driver.get().findElement(By.xpath("(//*[contains(@title,'"+str+"')])"));

        return element;
    }

}
