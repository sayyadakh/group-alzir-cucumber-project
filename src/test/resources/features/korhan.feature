@KORHAN
Feature: user should be able to use "Tags" filter under 'Fleet-Vehicles' page
  User Story: As a user, I should be able to use "Tags" filter under 'Fleet-Vehicles' page

  Scenario Outline: Login as a userType
    When user is on the login page
    And user logged in as "<userType>"

    Examples:
      |userType|
      |driver  |
      |salesManager|

  Scenario: User select "Tags" filter under 'Fleet-Vehicles' page
    When user is on dashboard page
    And user hover over on Fleet module
    And user click on vehicles button
    And user select tags filter
    Then user select is any of on filer options
    And user select compact value
    Then user sees all the compact tagged vehicles on the page
