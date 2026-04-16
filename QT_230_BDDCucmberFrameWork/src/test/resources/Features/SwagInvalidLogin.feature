Feature: Swag Labs InvalidLogin

Scenario:: Login with InValid Credentionls 

Given User is on the Swag Labs Login Page
When User enters invalid username "sdaskjdkh"  and invalid password "sdfsdjkf"
And User clicks on the login button
Then User should see an error message "Epic sadface: Username and password do not match any user in this service"

