Feature: Login Function

#Scenario: Valid login

#Given User is on Login Page
#When User enters credentials
#Then Homepage is displayed

#Scenario: Valid login

#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Homepage is displayed

Scenario Outline: Valid login
Given User is on Login Page
When User enters "<username>" and "<password>"
Then Homepage is displayed

Examples:
|username|password|
|tomsmith|SuperSecretPassword!|
|testuser1|testuser1|


