Feature: Deal data creation
Scenario: Free CRM create a new deal

Given User is already on login page
    When title of login page is free CRM
    Then user enters username and password
    |soumya456|$oumya@12|
    Then user clicks on login
    Then user is on home page
    Then user moves to new deals page
    Then user enters deals details
    | Testdeal | 1000 |50| 10 |
    Then close the browser