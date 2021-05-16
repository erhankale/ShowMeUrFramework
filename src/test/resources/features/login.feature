Feature: User should login

  @loginPos @smoke
  Scenario: user sign in an account
    Given user is on the main page
    When user should click on "Sign in" button
    And user should sign in with valid credentials
    Then user should get the approval text

  @loginNeg @smoke
  Scenario: user can not sign in with invalid credentials
    Given user is on the main page
    When user should click on "Sign in" button
    And user should sign in with invalid credentials
    Then user get authentication fail message

