Feature: Test the login functionality on SDET University


  Scenario: the user should be able to login with correct username and correct password
    Given user is on login page
    When user enters correct username and correct password
    Then user gets confirmation