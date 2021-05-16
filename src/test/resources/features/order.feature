Feature: User Should Order A Product

  Background:
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

    @wip
  Scenario Outline: User Should Order An Item
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
      | T-shirt | 7        | M    | Blue  | Pay by check     |
