Feature: quick find search

Scenario Outline: search by brands

Given I am on homepage
When i enter a "<product>"
And i click on quick find icon
Then i see related product list

Examples:
|product	|
|alexa|