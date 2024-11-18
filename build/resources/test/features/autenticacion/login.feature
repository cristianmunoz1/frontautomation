Feature: Login functionality
  As a user
  I want to login to the application
  So that I can access my account

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I login with username "julian@google.com.co" and password "123456"
    Then I should see the dashboard

  Scenario: Failed login with invalid credentials
    Given I am on the login page
    When I login with username "invalid" and password "wrong123."
    Then I should see an error message

