Feature: Navigating through Cart page

  Background: Using the cart page
    Given I am on the cart page

  Scenario: Clicking on the product image/title
    When I click on the image or title of the product
    Then I will go to the item page of that product

  Scenario: Clicking add to cart
    When I click on 'add to cart'
    Then The button will change to display 'Remove' and the cart will update

  Scenario: An item is displayed in the cart
    When An item is displayed inside the cart
    Then I will have an option to continue shopping

  Scenario: An item is displayed in the cart
    When An item is displayed inside the cart
    Then I will have an option to checkout

  Scenario: An item is displayed in the cart
    When An item is displayed inside the cart
    Then I will have an option to remove that item from the cart

  Scenario: Getting to the Twitter page from the Cart page
    When I click on the Twitter icon
    Then I will go to the Twitter page

  Scenario: Getting to the Facebook page from the Cart page
    When I click on the Facebook icon
    Then I will go to the Facebook page

  Scenario: Getting to the Linkedin page from the Cart page
    When I click on the Linkedin icon
    Then I will go to the Linkedin page

