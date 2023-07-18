Feature: As a user, I should be able to access to the help page

  Background: user is already on the dash board
  Scenario: Verify user can access to the help page

    Given user clicks the question mark (get help)
    Then user verifies "Welcome to Oro Documentation" title on a new opened tab