Feature: Free CRM login feature

  #without examples :
  #Scenario: Free CRM login scenario
  #Given User is already on login page
  #When title of login page is free CRM
  #Then user enters "soumya456" and "$oumya@12"
  #Then user clicks on login
  #Then user is on home page
  #Then close the browser
  #with Examples:
  Scenario Outline: Free CRM login scenario
    Given User is already on login page
    When title of login page is free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login
    Then user is on home page
    Then close the browser

    Examples: 
      | username  | password  |
      | soumya456 | $oumya@12 |
      | naveenk   | test@123  |
      | navefenk  | test@123  |
