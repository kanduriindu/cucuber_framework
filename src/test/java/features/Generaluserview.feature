Feature: general user view
  Scenario: Validate  general user is able to view products without logging in
    Given user navigates to the online products page
    When user clicks on formal shoes dropdown
    Then user should be able to view the products
