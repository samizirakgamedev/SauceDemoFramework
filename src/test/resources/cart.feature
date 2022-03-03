Feature: Navigating through Cart page

  Background: Using the cart page
    Given I am on the cart page

  Scenario: Clicking on the image or title of the product
    When I click on the image or title of the product
    Then I will go to the inventory item page of that product

  Scenario: Clicking on 'continue shopping' in cart page
    When I click on 'continue shopping' in the cart page
    Then I will go back to the inventory page

  Scenario: Clicking on 'Checkout' in cart page
    When I click on 'Checkout' in the cart page
    Then I will go to the checkout step one page

  Scenario: An item is displayed in the cart
    When An item is displayed inside the cart
    Then I will have an option to remove that item from the cart

  Scenario: An item is displayed in the cart
    When An item is displayed inside the cart
    Then I will see the price of the product

  Scenario: Getting to the Twitter page from the Cart page
    When I click on the Twitter icon
    Then I will go to the Twitter page

  Scenario: Getting to the Facebook page from the Cart page
    When I click on the Facebook icon
    Then I will go to the Facebook page

  Scenario: Getting to the Linkedin page from the Cart page
    When I click on the Linkedin icon
    Then I will go to the Linkedin page
