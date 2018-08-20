Feature: Free CRM create contacts
Scenario Outline: Verify create contact
 		Given User is already on login page
    When title of login page is free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login
    Then user is on home page
    Then user navigate to new contact page
    Then user provide "<firstname>" and "<lastname>" and "<position>"
    Then click on submit    
    Then close the browser
    
    Examples:
    |username|password|firstname|lastname|position|
    |soumya456|$oumya@12|Kiriti|Chavva|HR|
    |naveenK|test@123|soumya|ch|Manager|
  
