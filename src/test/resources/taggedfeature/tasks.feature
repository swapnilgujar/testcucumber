Feature: Tasks Managment

@SmokeTest @RegressionTest
Scenario:  Create a Task
Given User is on CRM home page
When User logs in with valid creadintials
Then User create a new task

@RegressionTest
Scenario:  Update a Task
Given User is on CRM home page
When User logs in with valid creadintials
Then User update a task

Scenario:  Delete a Task
Given User is on CRM home page
When User logs in with valid creadintials
Then User deletes a task