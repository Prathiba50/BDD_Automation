
Feature: Test login functionality

  @Logins
  Scenario Outline: Check login is successful with valid credentials
    Given Browser should be in open condition
    And User is on login page
    When User enters the <username> and <password>
    And User clicks on login
    Then user should navigated to the homepage
    And CLick on Logout
    Examples:
      | username | password |
      |prathibhak | India123 |
      |prathibhak| India123  |


