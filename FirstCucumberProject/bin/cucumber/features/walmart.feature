Feature: walmart test sets.

  Scenario: Users are able to search on walmart homepage
    Given I am on walmart homepage
    When do searh
    Then Close all Open Browsers

  Scenario: Users are able to select all values from search dropdown
    Given I am on walmart homepage
    When Select from dropdown list
    Then Close all Open Browsers

  Scenario: Users are able to find store map with nearby walmart stores in Google Chrome Browser
    Then Close All Browsers
    Given Open Browser "CHROME"
    Given Looks for walmart near By
    Then Close all Open Browsers

  Scenario: Users are able to find store map with nearby walmart stores in Firefox Browser
    Then Close All Browsers
    Given Open Browser "FIREFOX"
    Given Looks for walmart near By
    Then Close all Open Browsers

  Scenario: Users are able to find store map with nearby walmart stores in Microsoft Edge Browser
    Then Close All Browsers
    Given Open Browser "MICROSOFE EDGE"
    Given Looks for walmart near By
    Then Close all Open Browsers

  Scenario: Users are able to find store map with nearby walmart stores in Google Chrome Browser
    Then Close All Browsers
    Given Open Browser "IE"
    Given Looks for walmart near By
    Then Close all Open Browsers
