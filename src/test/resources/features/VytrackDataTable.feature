@wip
Feature: Modules for Driver as DataTable


  Scenario: Menu Options for driver
    Given user is on the login page
    When user logged in as "driver"
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |