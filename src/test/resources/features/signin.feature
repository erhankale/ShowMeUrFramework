Feature: User should create an account

  @create @smoke
  Scenario: User Signs in An Account
    Given user is on the main page
    When user should click on "Sign in" button
    And user should create an account
    And user should fill in required form
    Then user should get the approval text