Feature: Able to provide the personal details and navigate to different pages on the website

  Background: Setting up the Browser
    Given I am on the Checkout One page

    Scenario: Getting to the Checkout Two page from the Checkout One page
      When I enter my first name
      And I enter my last name
      And I enter my postal code
      And I click on the Continue button
      Then I will go to the Checkout Two page

    Scenario: Getting to the Your Cart page via cancel button from the Checkout One page
      When I click on Cancel button
      Then I will go to the Your Cart page

    Scenario: Getting to the Your Cart page via cart icon from the Checkout One page
      When I click on Cart icon
      Then I will go to the Your Cart page

    Scenario: Getting to the Side bar from the Checkout One page
      When I click on Side bar icon
      Then I will go to the Side bar
