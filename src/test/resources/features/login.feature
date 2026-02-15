Feature: Smoke

  Scenario: user is able to login with valid credentials as a librarian
    Given user is on the login page
    When user enters "librarian11@library" and "libraryUser"
    And clicks on the Login button
    Then user can see the following url "https://library2.cydeo.com/#dashboard"
    And user can see the user account name contains "Test Librarian"
