Feature: Logged in user view
  Scenario: Validate user is able to view after login
    Given user navigates the login page
    When user successfully enters the log in details
    Then user should be able to view the product category page
