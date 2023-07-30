Feature: SauceDemo e2e Task

  @wip
  Scenario Outline: Success Shopping
    Given Navigate to "https://www.saucedemo.com/"
    When Login with the valid credentials
    And Sort the products high to low
    Then Validate current page by page title "Products"
    When Add to cart at least two item "Sauce Labs Bolt T-Shirt" and "Sauce Labs Bike Light"
    Then Assert that the basket shows the true number of product
    When Navigate to Your Cart page
    Then Validate current page by page title "Your Cart"
    And Assert that the right items named "Sauce Labs Bolt T-Shirt" and "Sauce Labs Bike Light" added to cart
    When Go to checkout page and fill "<firstname>" and "<lastname>" and "<postalCode>"
    Then Validate current page by page title "Checkout: Your Information"
    When Click continue button and go to the checkout overview page
    Then Assert the price of items
    And Validate current page by page title "Checkout: Overview"
    Then Click finish and assert the success shopping message "Thank you for your order!"
    Examples:
      | firstname | lastname  | postalCode |
      | Jack      | Nicholson | 7755       |