Feature: Login to https://aspiration.com/

  Scenario: Verify that as a user,they can view our products,
  and prices by navigating from the home page "https://aspiration.com/" to the products page
  via the “Spend & Save”
  @"Aspiration" @"AspirationPlus"
    Given User navigated to "Home page" https://aspiration.com/
    When User clicked “Spend & Save” link at the top of the home page
    Then User can view our "products" and "prices"
    And User can see 2 card products, "Aspiration" and "Aspiration Plus"

  @"Aspiration"
    Given User on “Spend & Save” page
    When  User clicked "Get Aspiration"
    Then A modal containing an input field for an "email address" to "sign up" are displayed

  @"AspirationPlus"
    Given User on “Spend & Save” page
    When  User clicked "Get Aspiration plus"
    Then A modal with monthly and yearly plans are displayed
    And Yearly radio option is "$71.88 paid once yearly" and visible
    And Monthly radio option is "$7.99 paid monthly" and visible