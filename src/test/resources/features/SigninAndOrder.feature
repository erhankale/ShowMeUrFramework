Feature: User Should Sign In And Order Item

  @signinandorder
  Scenario:
    Given user is on the main page
    When user should click on "Sign in" button
    And user should create an account
    And user should fill in required form
    Then user should get the approval text
    Given user should search an "Dress"
    And user should choose one of the items
    And user should choose "4", "M", "Black"
    When user should complete all steps to order
    And user should choose "Pay by check"
    And user confirm the order
    Then user should verify the confirmation message