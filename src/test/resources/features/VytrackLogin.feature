@login
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager

  Background:
    Given user is on the login page

@wip
  Scenario Outline: Verify login with different user types
    When user logged in as "<userType>"
    # When user logged in with username as "user1" and password "UserUser123"

