Feature: walmart test sets.

Scenario: Users are able to search on walmart homepage
Given I am on walmart homepage
When  do searh 
Then Close all Open Browsers


Scenario: Users are able to select all values from search dropdown
Given I am on walmart homepage
When  Select from dropdown list 
Then Close all Open Browsers

Scenario: Users are able to find store map with nearby walmart stores in Google Chrome Browser
Given Do Search in Google Chrome Browser
Then Close all Open Browsers

Scenario: Users are able to find store map with nearby walmart stores in Firefox
Given Do Search in Firefox
Then Close all Open Browsers

Scenario: Users are able to find store map with nearby walmart stores in Microsoft Edge
Given Do Search in Microsoft Edge
Then Close all Open Browsers

Scenario: Users are able to find store map with nearby walmart stores in Internet Explorer
Given Do Search in Internet Explorer Browser
Then Close all Open Browsers