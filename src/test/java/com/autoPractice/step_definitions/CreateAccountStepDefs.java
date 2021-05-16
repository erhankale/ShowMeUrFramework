package com.autoPractice.step_definitions;

import com.autoPractice.pages.AccountPage;
import com.autoPractice.pages.DashBoardPage;
import com.autoPractice.pages.RegistrationPage;
import com.autoPractice.utilities.BrowserUtils;
import com.autoPractice.utilities.ConfigurationReader;
import com.autoPractice.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

public class CreateAccountStepDefs {

    WebDriver driver = Driver.get();
    DashBoardPage dashBoardPage = new DashBoardPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    String firstName = faker.name().firstName().replaceAll("'","");
    String lastName = faker.name().lastName().replaceAll("'","");

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        String url = ConfigurationReader.get("url");
        driver.get(url);
    }

    @When("user should click on {string} button")
    public void user_should_click_on_button(String str) {
        dashBoardPage.dashBoardBtns(str).click();
        BrowserUtils.waitFor(2);
    }

    @When("user should create an account")
    public void user_should_create_an_account() {
        String email = firstName+lastName+"@gmail.com";
        registrationPage.emailBox.sendKeys(email);
        BrowserUtils.waitFor(2);
        BrowserUtils.waitFor(2);
        registrationPage.createBtn.click();
    }

    @When("user should fill in required form")
    public void user_should_fill_in_required_form() {
       registrationPage.formFirstName.sendKeys(firstName); BrowserUtils.waitFor(2);
       registrationPage.formLastName.sendKeys(lastName); BrowserUtils.waitFor(2);
       registrationPage.formPass.sendKeys(faker.internet().password(5,8)); BrowserUtils.waitFor(2);
       registrationPage.formAddress1.sendKeys(faker.address().fullAddress()); BrowserUtils.waitFor(2);
       registrationPage.formCity.sendKeys(faker.address().city()); BrowserUtils.waitFor(2);
       Select selectState = new Select(registrationPage.formState);
       selectState.selectByValue(String.valueOf(faker.number().numberBetween(1,53))); BrowserUtils.waitFor(2);
       registrationPage.formPostCode.sendKeys(String.valueOf(faker.number().numberBetween(1000,9999))); BrowserUtils.waitFor(2);
       registrationPage.forMobile.sendKeys(faker.phoneNumber().cellPhone()); BrowserUtils.waitFor(2);
       registrationPage.registerBtn.click(); BrowserUtils.waitFor(2);
    }

    @Then("user should get the approval text")
    public void user_should_get_the_approval_text() {
        String expected = "Welcome to your account.";
        String actual = new AccountPage().approvalText.getText();
        assertTrue(actual.contains(expected));
    }


}
