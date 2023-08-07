Feature: user should be able to navigate to any module or any page dynamically
@smoke
  Scenario: verify users are able to navigate to sub-modules dynamically
    Given user is on the login page
    When user logged in as "sales manager"
    And user hovers over to a "Fleet" and navigates to a "Vehicle Costs"
    And user verifies "x"