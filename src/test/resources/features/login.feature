Feature: User should log in

  @loginPos @smoke
  Scenario: user should log in an account
    Given user is on the main page
    When user should click on "Sign in" button
    And user should log in with valid credentials
    Then user should get the approval text

  @loginNeg @smoke
  Scenario: user can not log in with invalid credentials
    Given user is on the main page
    When user should click on "Sign in" button
    And user use invalid credentials
    Then user get authentication fail message

