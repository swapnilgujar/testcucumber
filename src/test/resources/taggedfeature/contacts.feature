@PhaseOne
Feature: Contact Managment

@SmokeTest @RegressionTest
Scenario:  Create a contact
Given User is on CRM home page
When User logs in with valid creadintials
Then User create a new Contact

@RegressionTest
Scenario:  Update a contact
Given User is on CRM home page
When User logs in with valid creadintials
Then User update a Contact

Scenario:  Delete a contact
Given User is on CRM home page
When User logs in with valid creadintials
Then User deletes a Contact