Feature: Dashboard Page to Created Account
    As a user
    I want to be able to navigate to the dashboard page after creating an account
    So that I can see my account details and manage my settings
    Scenario: User successfully creates an account and is redirected to the dashboard
        Given I am on dashboard page
        When I click navbar
        And I click tab account
        And I click create account
        Then I should be redirected to the Register page