Feature: User Should Order A Product

  Background:
  Given user should log in an account
    Given user is on the main page
    When user should click on "Sign in" button
    And user should log in with valid credentials

  @order
  Scenario: User should add into cart
    Given user should search an "Dress"
    And user should choose one of the items
    And user should choose "4", "M", "Black"
    When user should complete all steps to order
    And user should choose "Pay by check"
    And user confirm the order
    Then user should verify the confirmation message
