Feature: feature to test google search functionality


  @TEST123
  Scenario: Validate google search is working

    Given browser is open
    And User is on google search page
    When User enters the text in search box.
    And hits enter
    Then user is navigated to the search results

