Feature: InventoryPage
  All features in inventory page

Background: Setup the browser
  Given I am in inventory page

  @Inventory @InventoryPage
    Scenario Outline: Browsing the inventory page by clicking the product image to see product price
    When I click the product image<image_index>
    Then I get into the product information page
    And  The price is match with the product

    Examples:
    |image_index|
    |0          |
    |2          |
    |4          |
    |6          |
    |8          |
    |10         |

  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product image to see product name
    When I click the product image<image_index>
    Then I get into the product information page
    And  The product name is match with the link

    Examples:
      |image_index|
      |0          |
      |2          |
      |4          |
      |6          |
      |8          |
      |10         |

  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product image to see product image
    When I click the product image<image_index>
    Then I get into the product information page
    And  The product image is match with the link

    Examples:
      |image_index|
      |0          |
      |2          |
      |4          |
      |6          |
      |8          |
      |10         |


  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product image to see product description
    When I click the product image<image_index>
    Then I get into the product information page
    And  The product description is match with the link

    Examples:
      |image_index|
      |0          |
      |2          |
      |4          |
      |6          |
      |8          |
      |10         |


  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product name to see product price
    When I click the product name<name_index>
    Then I get into the product information page
    And  The price is match with the product

    Examples:
      |name_index|
      |0         |
      |2         |
      |4         |
      |6         |
      |8         |
      |10        |

  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product name to see product name
    When I click the product name<name_index>
    Then I get into the product information page
    And  The product name is match with the link

    Examples:
      |name_index|
      |0         |
      |2         |
      |4         |
      |6         |
      |8         |
      |10        |

  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product name to see product image
    When I click the product name<name_index>
    Then I get into the product information page
    And  The product image is match with the link

    Examples:
      |name_index|
      |0         |
      |2         |
      |4         |
      |6         |
      |8         |
      |10        |

  @Inventory @InventoryPage
  Scenario Outline: Browsing the inventory page by clicking the product image to see product description
    When I click the product name<name_index>
    Then I get into the product information page
    And  The product description is match with the link

    Examples:
      |name_index |
      |0          |
      |2          |
      |4          |
      |6          |
      |8          |
      |10         |


  @Inventory @InventorySorting
  Scenario: Sorting name A to Z by dropdown list
    When I select sort Z to A from the dropdown list
    When I select sort A to Z from the dropdown list
    Then All item sort in ascending order with its name

  @Inventory @InventorySorting
  Scenario: Sorting name Z to A by dropdown list
    When I select sort Z to A from the dropdown list
    Then All item sort in descending order with its name

  @Inventory @InventorySorting
  Scenario: Sorting name low to high by dropdown list
    When I select sort price low to high from the dropdown list
    Then All item sort in ascending order with its price

  @Inventory @InventorySorting
  Scenario: Sorting price high to low by dropdown list
    When I select sort price high to low from the dropdown list
    Then All item sort in descending order with its price

    @Inventory @InventoryAddToCart
    Scenario Outline: Add product to the cart
      When I click add to cart or remove button <productID>
      Then <productID> button shows remove

      Examples:
        |productID |
        |0         |
        |1         |
        |2         |
        |3         |
        |4         |
        |5         |

  @Inventory @InventoryAddToCart
  Scenario Outline: Add product to the cart and then remove from the cart
    When I click add to cart or remove button <productID>
    When I click add to cart or remove button <productID>
    Then <productID> button shows add to chart

    Examples:
      |productID |
      |0         |
      |1         |
      |2         |
      |3         |
      |4         |
      |5         |

  @Inventory @InventoryAddToCart
  Scenario Outline: Add product to the cart and the top right corner shows product amount
    When I click <productID> add to cart or remove button
    Then The cart icon show plus one product

    Examples:
      |productID |
      |0         |
      |1         |
      |2         |
      |3         |
      |4         |
      |5         |

  @Inventory @InventoryAddToCart
  Scenario: Add all product to the cart and the top right corner shows product amount
    When I click all product add to cart or remove button
    Then The cart icon shows all product amount

  @Inventory @InventoryAddToCart
  Scenario Outline: Click to the inventory page then add product to the cart
    When I click the product image<image_index>
    Then I get into the product information page
    And I click add to cart or remove button in inventory page
    Then The button in inventory page shows remove

    Examples:
      |image_index|
      |0          |
      |2          |
      |4          |
      |6          |
      |8          |
      |10         |

  @Inventory
    Scenario Outline: Click to inventory page then press back button
      When I click the product image<image_index>
      Then I get into the product information page
      And I click back to products button
      Then I get into the inventory page

      Examples:
        |image_index|
        |0          |
        |2          |
        |4          |
        |6          |
        |8          |
        |10         |
