Feature: InventoryPage
  All features in inventory page

Background: Setup the browser
  Given I am in inventory page

  @InventoryPage @InventoryPageSideMenu
  Scenario: All item link from side menu
    When I click the side menu button
    And  I click the all items button
    Then I get into the inventory page

  @InventoryPage @InventoryPageSideMenu
  Scenario: About link from side menu
    When I click the side menu button
    And  I click the about button
    Then I get into the SauceLabs page

  @InventoryPage @InventoryPageSideMenu
  Scenario: Logout button from side menu
    When I click the side menu button
    And  I click the logout button
    Then I logout and get into the login page

  @InventoryPage @InventoryPageSideMenu
  Scenario: Reset app state button from side menu
    When I click the side menu button
    And  I click the reset app state button
    Then All item clear from the cart

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sort name A to Z by dropdown list
    When I click the dropdown list
    And  I select Name A to Z option
    Then All item sort in ascending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sort name Z to A by dropdown list
    When I click the dropdown list
    And  I select Name Z to A option
    Then All item sort in descending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sort name low to high by dropdown list
    When I click the dropdown list
    And  I select Name Z to A option
    Then All item sort in ascending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sort price high to low by dropdown list
    When I click the dropdown list
    And  I select Name Z to A option
    Then All item sort in descending order with its price

  @InventoryPage @InventoryPageFooter
  Scenario: Facebook link from footer
    When I click the Facebook button
    Then I get into the Facebook page

  @InventoryPage @InventoryPageFooter
  Scenario: Instagram link from footer
    When I click the Instagram button
    Then I get into the Instagram page

  @InventoryPage @InventoryPageFooter
  Scenario: LinkedIn link from footer
    When I click the LinkedIn button
    Then I get into the LinkedIn page

  @InventoryPage @CartButton
    Scenario: Cart link
    When I click the cart button
    Then I get into the cart page

  @InventoryPage @Products
    Scenario: Check product price is correct
    When I click the product
    Then I get into the product information page
    And  The price is a valid number

  @InventoryPage @Products
  Scenario: Check product name is correct
    When I click the product
    Then I get into the product information page
    And  The product name is match with the link

  @InventoryPage @Products
  Scenario: Check product description is correct
    When I click the product
    Then I get into the product information page
    And  The product description is match with the link

  @InventoryPage @Products
  Scenario: Check product image is correct
    Then I get into the product information page
    And  The product image is match with the link
