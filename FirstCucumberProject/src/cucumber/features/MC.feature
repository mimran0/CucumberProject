Feature: Mortgage Calculator

Scenario:
Then Close all Open Browsers
Given Open Browser MC - "CHROME"
Then Enter all data in the calculator and click on calculate button
And Check expected Payment with Actual Payment
Then Close all Open Browsers