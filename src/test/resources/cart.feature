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








  # Clicking the product image/title takes u to that item page (or from cart)
  # Upon clicking add to cart, change to remove button + update the cart (quantity)
  # Social links in the footer (+ image)
  # Cart
  # Continue shopping from cart
  # Remove items from cart
