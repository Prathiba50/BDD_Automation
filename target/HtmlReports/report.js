$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "feature to test google search functionality",
  "description": "",
  "id": "feature-to-test-google-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate google search is working",
  "description": "",
  "id": "feature-to-test-google-search-functionality;validate-google-search-is-working",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TEST123"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is on google search page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters the text in search box.",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "hits enter",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is navigated to the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "googleSearchSteps.browser_is_open()"
});
formatter.result({
  "duration": 5574143600,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchSteps.user_is_on_google_search_page()"
});
formatter.result({
  "duration": 695012000,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchSteps.user_enters_the_text_in_search_box()"
});
formatter.result({
  "duration": 2156278700,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchSteps.hits_enter()"
});
formatter.result({
  "duration": 2215551200,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchSteps.user_is_navigated_to_the_search_results()"
});
formatter.result({
  "duration": 3955708000,
  "status": "passed"
});
});