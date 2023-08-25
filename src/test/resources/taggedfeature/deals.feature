@PhaseTwo
Feature: Deals Managment

@SmokeTest
Scenario:  Create a Deal
Given User is on CRM home page
When User logs in with valid creadintials
Then User creates a deal

@RegressionTest
Scenario:  Update a Deal
Given User is on CRM home page
When User logs in with valid creadintials
Then User update a deal


Scenario:  Delete a contact
Given User is on CRM home page
When User logs in with valid creadintials
Then User deletes a deal