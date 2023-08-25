Feature: Login Function

#Scenario: Valid login

#Given User is on Login Page
#When User enters credentials
#Then Homepage is displayed

Scenario: Valid login

Given User is on Login Page
When User enters "tomsmith" and "SuperSecretPassword!"
Then Homepage is displayed