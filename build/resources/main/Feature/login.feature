#Author - Prathibha
#Date - 20/09/2023
#Description - "Verifying the login feature"

  @smoke
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user is enters the username and password
    And  clicks on login button
    Then user is navigated to the home page

