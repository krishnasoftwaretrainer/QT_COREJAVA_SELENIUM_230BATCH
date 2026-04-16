@loginTest
Feature: SwagLabs Login Functionality

  Scenario Outline: Swag Login Test with different username and password
    Given The user is on the login page
    When The user enters a  username "<username>"
    And The user enters a  password "<password>"
    And The user clicks the login button
    Then The user should see the result page

    Examples:
      | username        | password      |
      | standard_user  | secret_sauce |
      | invalid_user   | invalid_password |
      | standard_user | invalid_password |
      | invalid_user  | secret_sauce |
      | standard_user |  	          |   
      | invalid_user  |               |
      |   			  | secret_sauce |
      |               | invalid_password |
      |               |                  |
  
      
