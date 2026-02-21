Feature: Login functionality

  Scenario: Librarian logs in successfully
    Given user is on the login page
    When user logs in as a librarian
    Then user should be on the dashboard page
    And user account name should be displayed
