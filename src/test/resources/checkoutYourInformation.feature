Feature: Able to provide the personal details and navigate to different pages on the website

  Background: Setting up the Browser
    Given I am on the Checkout Your Information page

    Scenario: Getting to the Checkout Overview page from the Checkout Your Information page
      When I enter my first name
      And I enter my last name
      And I enter my postal code
      And I click on the Continue button
      Then I will go to the Checkout Overview page

    Scenario: Getting to the Your Cart page via cancel button from the Checkout Your Information page
      When I click on Cancel button
      Then I will go to the Your Cart page

    Scenario: Getting to the Your Cart page via cart icon from the Checkout Your Information page
      When I click on Cart icon
      Then I will go to the Your Cart page

    Scenario: Getting to the Inventory page from the Checkout Your Information page
      When I click on Inventory icon
      Then I will go to the Inventory page


    Scenario: Getting to the Twitter page from the Checkout Your Information page
      When I click on Twitter icon
      Then I will go to the Twitter page

    Scenario: Getting to the Facebook page from the Checkout Your Information page
      When I click on Facebook icon
      Then I will go to the Facebook page

    Scenario: Getting to the Linkedin page from the Checkout Your Information page
      When I click on Linkedin icon
      Then I will go to the Linkedin page