Feature: Register functionality
  As a user
  I want to register my information into the application
  So that I can identify my into the platform

  Scenario: Successful register in the application
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399329" and email "jonasjonas3@google.com.co" and password "Hola123." and check the terms and conditions and privacy policy
    Then I should see the correct register alert

  Scenario: Unsuccessful register in the application
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399329" and email "julian@google.com.co" and password "Hola123." and check the terms and conditions and privacy policy
    Then I should see the incorrect register alert

