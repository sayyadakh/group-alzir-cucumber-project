@seyda

Feature: User should be able to create a vehicle service log
  User story: As a user, I should be able to Create a vehicle services logs.


  Scenario: Create a vehicle service log as a store manager
    Given user is on the login page
    When user logged in as "store manager"
    When user hover over on Fleet module
    And user should see "Vehicle Services Logs"
    And user click on "Vehicle Services Logs" button
    Then verify user sees "You do not have permission to perform this action." message