package com.autoPractice.step_definitions;

import com.autoPractice.pages.DashBoardPage;
import com.autoPractice.pages.OrderPage;
import com.autoPractice.pages.SearchPage;
import com.autoPractice.utilities.BrowserUtils;
import com.autoPractice.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(searchPage.item1).click(searchPage.item1).perform();
//        searchPage.item1.click();
        BrowserUtils.waitFor(1);

    }

    @And("user should choose {string}, {string}, {string}")
    public void userShouldChoose(String quantity, String size, String color) {
        BrowserUtils.waitFor(4);
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
        orderPage.proceedBtn2.click();
        BrowserUtils.waitFor(5);
        assertTrue(orderPage.addressCheckBox.isSelected());
        orderPage.proceedBtn2.click();
        orderPage.termsCheckBox.click();
        orderPage.proceedBtn2.click();

    }

    @And("user should choose {string}")
    public void userShouldChoose(String str) {

        orderPage.selectPayment(str).click();

    }

    @And("user confirm the order")
    public void userConfirmTheOrder() {
        orderPage.confirmBtn.click();
    }

    @Then("user should verify the confirmation message")
    public void userShouldVerifyTheConfirmationMessage() {

        assertTrue(orderPage.orderConfirmationMessage.isDisplayed());
    }

}
