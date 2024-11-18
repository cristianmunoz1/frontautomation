Feature: Register functionality
  As a user
  I want to register my information into the application
  So that I can identify my into the platform

  Scenario: Successful register in the application
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399329" and email "jonasjonas4@google.com.co" and password "Hola123." and check the terms and conditions and privacy policy
    Then I should see the correct register alert

  Scenario: Unsuccessful register in the application
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399329" and email "julian@google.com.co" and password "Hola123." and check the terms and conditions and privacy policy
    Then I should see the incorrect register alert

  Scenario: Unsuccessful register because incorrect phone
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "310539932" and email "julian@google.com.co" and password "Hola123." and check the terms and conditions and privacy policy
    Then I should see the incorrect cellphone message

  Scenario: Unsuccessful register because incorrect email
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399326" and email "julian.google.com.co" and password "Hola123." and check the terms and conditions and privacy policy
    Then I should see the incorrect email message

  Scenario: Unsuccessful register because incorrect password
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399326" and email "julian@google.com.co" and password "Hola" and check the terms and conditions and privacy policy
    Then I should see the incorrect password message

  Scenario: Unsuccessful register because no terms and privacy accepted
    Given I am on the register page
    When I type the name "Jonás Granda" and phone number "3105399326" and email "julian@google.com.co" and password "Hola123." and don't check the terms and privacy policy
    Then I should see the no privacy accepted message
    And I should see the no terms accepted message