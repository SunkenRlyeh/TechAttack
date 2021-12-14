@newaccount
Feature: Signing Up on Oscommerce.com

Scenario Outline: Signing up

Given I am on oscommerce.com
When  I click on my account button
And I click on continue button from new customer section
Then I see my account information page
When I select male or female radio button
And I enter "<first name>" "<last name>" "<dob>" and "<email address>"
And I select a country from the drop down
And I click continue
Then I see a pop up error message

Examples:
|first name | last name | dob | email address |
|first name | last name | dob | email address |
