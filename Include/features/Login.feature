Feature: Login Functionality
  I want to ensure a user with valid credentials can login to the system

  Scenario Outline: Verify login is successful with valid credentails
    Given user is on login page
    When user enters valid <username> and <password>
    And clicks on login button
    Then user is navigated to the homePage

    Examples: 
      | username | password  |
      | Admin    | admin123  |

  Scenario Outline: Verify login fails with invalid credentials
    Given user is on login page
    When user enters invalid <username> and <password>
    And clicks on login button
    Then user sees an error message

    Examples: 
      | username | password  |
      | sdmin    | admin1234 |
