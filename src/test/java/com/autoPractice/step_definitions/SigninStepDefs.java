package com.autoPractice.step_definitions;

import com.autoPractice.pages.SigninPage;
import com.autoPractice.utilities.BrowserUtils;
import com.autoPractice.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class SigninStepDefs {

    SigninPage signinPage = new SigninPage();


    @And("user should sign in with valid credentials")
    public void userShouldSignInWithValidCredentials() {
        signinPage.inputEmail.sendKeys(ConfigurationReader.get("userMail"));
        signinPage.inputPass.sendKeys(ConfigurationReader.get("userPassword"));
        signinPage.loginBtn.click();
    }

    @And("user should sign in with invalid credentials")
    public void userShouldSignInWithInvalidCredentials() {
        signinPage.inputEmail.sendKeys("userMail");
        signinPage.inputPass.sendKeys("userPassword");
        signinPage.loginBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user get authentication fail message")
    public void userGetAuthenticationFailMessage() {

        assertTrue(signinPage.errorMessage.isDisplayed());
    }
}
