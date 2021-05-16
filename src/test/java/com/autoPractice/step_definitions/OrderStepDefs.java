package com.autoPractice.step_definitions;

import com.autoPractice.pages.DashBoardPage;
import com.autoPractice.pages.OrderPage;
import com.autoPractice.pages.SearchPage;
import com.autoPractice.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

public class OrderStepDefs {

    SearchPage searchPage = new SearchPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    OrderPage orderPage = new OrderPage();

    @Given("user should search an {string}")
    public void userShouldSearchAn(String str) {
        dashBoardPage.searchBox.sendKeys(str);
        dashBoardPage.searchBtn.click();
    }

    @And("user should choose one of the items")
    public void userShouldChooseOneOfTheItems() {
        searchPage.item1.click();
        BrowserUtils.waitFor(4);
    }

    @And("user should choose {string}, {string}, {string}")
    public void userShouldChoose(String quantity, String size, String color) {
        orderPage.quantityBox.sendKeys(Keys.BACK_SPACE+quantity);
        Select select = new Select(orderPage.sizeSelection);
        select.selectByVisibleText(size);
        orderPage.selectColor(color).click();
        orderPage.addBtn.click();
        BrowserUtils.waitFor(6);
        orderPage.proceedBtn.click();
    }

    @When("user should complete all steps to order")
    public void userShouldCompleteAllStepsToOrder() {

        assertTrue(orderPage.stockIcon.isDisplayed());
        orderPage.proceedBtn.click();




    }

    @And("user should choose {string}")
    public void userShouldChoose(String arg0) {
    }

    @And("user confirm the order")
    public void userConfirmTheOrder() {
    }

    @Then("user should verify the confirmation message")
    public void userShouldVerifyTheConfirmationMessage() {
    }

    @Given("user should log in an account")
    public void userShouldLogInAnAccount() {
    }
}
