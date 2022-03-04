Feature: Able to verify if the order has been placed and navigate to different pages on the website

  Background: Setting up the Browser
    Given I am on the Checkout Complete page

  Scenario: Getting to the Inventory page via back home button from the Checkout Complete page
    When I click on back home button
    Then I will go to the Inventory Page

  Scenario: Getting to the empty Your Cart page via cart icon from the Checkout Complete page
    When I click on Cart Icon
    Then I will go to the Your Cart Page
    And The cart will be empty

  Scenario: Getting to the Twitter page from the Checkout One page
    When I click on Twitter Icon
    Then I will go to the Twitter Page

  Scenario: Getting to the Facebook page from the Checkout One page
    When I click on Facebook Icon
    Then I will go to the Facebook Page

  Scenario: Getting to the Linkedin page from the Checkout One page
    When I click on Linkedin icon
    Then I will go to the Linkedin page