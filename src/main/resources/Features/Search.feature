
Feature:  feature to test Orangehrm search functionality

 

  
  Scenario: Validate OrangeHrm search is working
    Given browser window  is open
    When user enter username and password
    And click login
    When user enter employee name and Id
    Then results are shown below
 