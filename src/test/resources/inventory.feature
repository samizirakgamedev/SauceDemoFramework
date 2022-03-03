Feature: InventoryPage
  All features in inventory page

Background: Setup the browser
  Given I am in inventory page

  @InventoryPage @Products
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

  @InventoryPage @Products
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

  @InventoryPage @Products
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


  @InventoryPage @Products
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


  @InventoryPage @Products
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

  @InventoryPage @Products
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

  @InventoryPage @Products
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

  @InventoryPage @Products
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


  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting name A to Z by dropdown list
    When I select sort Z to A from the dropdown list
    When I select sort A to Z from the dropdown list
    Then All item sort in ascending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting name Z to A by dropdown list
    When I select sort Z to A from the dropdown list
    Then All item sort in descending order with its name

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting name low to high by dropdown list
    When I select sort price low to high from the dropdown list
    Then All item sort in ascending order with its price

  @InventoryPage @InventoryPageDropDownList
  Scenario: Sorting price high to low by dropdown list
    When I select sort price high to low from the dropdown list
    Then All item sort in descending order with its price