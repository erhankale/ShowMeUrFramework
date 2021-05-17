Feature: User Should Sign In And Order Item

  @signinandorder
  Scenario Outline: User should create account and order buy an item
    Given user is on the main page
    When user should click on "Sign in" button
    And user should create an account
    And user should fill in required form
    Then user should get the approval text
    Given user should search an "<item>"
    And user should choose one of the items
    And user should choose "<quantity>", "<size>", "<color>"
    When user should complete all steps to order
    And user should choose "<pay method>"
    And user confirm the order
    Then user should verify the confirmation message

    Examples:
      | item    | quantity | size | color | pay method       |
      | dress   | 3        | S    | Black | Pay by check     |
      | chiffon | 2        | L    | Green | Pay by bank wire |
