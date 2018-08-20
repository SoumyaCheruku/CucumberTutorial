Feature: Deal data creation

  Scenario: Free CRM create a new deal
    Given User is already on login page
    When title of login page is free CRM
    Then user enters username and password
      | username  | password  |
      | soumya456 | $oumya@12 |
    Then user clicks on login
    Then user is on home page
    Then user moves to new deals page
    Then user enters deals details
      | title      | amount | probability | comission |
      | Testdeal   |   1000 |          50 |        10 |
      | Testdealer |   2000 |          60 |        20 |
      | Testdeal   |    500 |          30 |        40 |
    Then close the browser
