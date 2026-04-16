Feature: Swag Labs Blank Login

Scenario:: Login with Blank Credentionls 

Given User is on the Swag Labs Login Page
When User enters valid username "" 
And User enters valid password ""
And User clicks on the login button
Then User should be navigated to an error message 


