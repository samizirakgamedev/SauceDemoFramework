Feature: InventoryPage
  All features in inventory page

Background: Setup the browser
  Given I am in inventory page

  @InventoryPage @Products
    Scenario Outline: Browsing the product page to see product price
    When I click the product <index>
    Then I get into the product information page
    And  The price is match with the product <index>

    Examples:
    |index|
    |0    |
    |2    |
    |4    |
    |6    |
    |8    |
    |10   |

  @InventoryPage @Products
  Scenario: Browsing the product page to see product name
    When I click the product
    Then I get into the product information page
    And  The product name is match with the link

  @InventoryPage @Products
  Scenario: Browsing the product page to see product description
    When I click the product

  @InventoryPage @Products
  Scenario: Browsing the product page to see product image
    Then I get into the product information page
    And  The product image is match with the link

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting name A to Z by dropdown list
    When I click the dropdown list
    And  I select Name A to Z option
    Then All item sort in ascending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting name Z to A by dropdown list
    When I click the dropdown list
    And  I select Name Z to A option
    Then All item sort in descending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting name low to high by dropdown list
    When I click the dropdown list
    And  I select Name Z to A option
    Then All item sort in ascending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting price high to low by dropdown list
    When I click the dropdown list
    And  I select Name Z to A option
    Then All item sort in descending order with its price