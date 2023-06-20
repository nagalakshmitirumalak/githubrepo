Feature: Register for an Account in Tutorialsninja Application

@register
Scenario: Register for the Application by providing valid deatils
Given I navigate to Register page
When I enter the below details
      |firstname    |arun                         |
      |lastname     |motoori                      |
      |email        |arun.seleniumhello1@gmail.com |
      |telephone    |136464                       |
      |password     |second@123                   |
      
 And I select the privacy policy option
 And I click on Continue button