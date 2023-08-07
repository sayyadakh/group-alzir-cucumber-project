@smoke
Feature: As a user, I should be able to access to the help page

  Scenario: Verify user can access to the help page

    Given user is on the login page
    When user logged in as "store manager"
    And user clicks the question mark (get help)
    Then user verifies "Welcome to Oro Documentation" title on a new opened tab


  Scenario: Verify user can access to the Vehicle Contract page

    Given user is on the login page
    When user logged in as "store manager"
    When user hover over on Fleet module
    And user clicks on Vehicle Contracts button
    Then user clicks on refresh button