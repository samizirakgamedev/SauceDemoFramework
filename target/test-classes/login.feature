Feature: Able to verify credentials and navigate to different pages on the website

  Background: Setting up the Browser
    Given I am on the Login Page

  Scenario Outline: Getting to the Inventory Page from the Login Page
    When I insert <username> and secret_sauce
    And I click on the login button
    Then I will go to the InventoryPage

    Examples:
      |        username         |
      |"standard_user"          |
      |"problem_user"           |
      |"performance_glitch_user"|

  Scenario: Staying in the Login Page as result of wrong username
    When I insert an invalid username and a valid password
    And I click on the login button
    Then I will stay in the Login Page

  Scenario: Staying in the Login Page as result of wrong password
    When I insert a valid username and an invalid password
    And I click on the login button
    Then I will stay in the Login Page