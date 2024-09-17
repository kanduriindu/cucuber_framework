Feature: new user registration  view
  Scenario: Validate new user is able to view after clicking on new Registration
    Given user navigates the login page
    When user clicks on new registration button
    Then user should be able to view the registration page
