@mustrun
Feature: To test automation practice website functionality
 

 @smoke
  Scenario: Validate automation practice website is working
    Given browser window is open
    And user click signin button 
    When user enter email address
    And user click on create an account
   
 
  @regression 
 Scenario: Creating a new account
  Given Chrome should launched and website is open
  And enter the email id and click create a account
  When user should fill the mandatory details
  And Click on Register
  
  @smoke @regression
  Scenario: sign in account
  Given browser get open
  And click the signin 
  When user enters <username> and <password>
  Then click signin button
 