Feature: Login to OrangeHRM Demo
  As a user, I want to log in to the OrangeHRM Demo so that I can access the dashboard.

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters "Admin" as the username and "admin123" as the password
    And the user clicks on the login button
    Then the user should be redirected to the dashboard
    And the user should see the "Dashboard" heading