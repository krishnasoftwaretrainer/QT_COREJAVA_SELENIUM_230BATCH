Feature: Swag Labs Valid Login

Scenario:: Login with Valid Credentionls 

Given User is on the Swag Labs Login Page
When User enters valid username "standard_user" 
And User enters valid password "secret_sauce"
And User clicks on the login button
Then User should be navigated to the Swag Labs Inventory Page


