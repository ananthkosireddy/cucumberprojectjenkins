Feature: demo web shop login feature file

  Scenario Outline: valid login data from demo web shop
    Given the login url of the demo web shop "http://demowebshop.tricentis.com/login"
    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks on login button
    Then user can see the log out

    Examples: 
      | email             |  | password |
      | askmail@email.com |  | abc123   |
      | askmail@ymail.com |  | abc123   |
      | askmail@gmail.com |  | abc123   |
