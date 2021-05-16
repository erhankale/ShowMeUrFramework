package com.autoPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(id="email_create")
    public WebElement emailBox;

    @FindBy(xpath="//*[@class='icon-user left']")
    public WebElement createBtn;

    @FindBy(id="customer_firstname")
    public WebElement formFirstName;

    @FindBy(id="customer_lastname")
    public WebElement formLastName;

    @FindBy(id="passwd")
    public WebElement formPass;

    @FindBy(id = "address1")
    public WebElement formAddress1;

    @FindBy(id="city")
    public WebElement formCity;

    @FindBy (id = "id_state")
    public WebElement formState;

    @FindBy(id="postcode")
    public WebElement formPostCode;

    @FindBy(id= "id_country")
    public WebElement formCountry;

    @FindBy(id = "phone_mobile")
    public WebElement forMobile;

    @FindBy (id = "submitAccount")
    public WebElement registerBtn;

}
