@Your_Loga
Feature: Your Loga Website

  @TC01_Loga
  Scenario: Search and select product then increase quantity as 2 then add to card and check the price
    Given The user launch an chrome browser
    When The user open an login page
    Then The user Search a product
    Then The user increase the quantity and click add to card
    Then check the price of the product

  @TC02_Loga
  Scenario: Invalid Search in Your Loga Application
    Given The user launch the chrome browser
    When The user open the login page
    Then The user perform Invalid Search
    Then Print the error message in the console

  @TC03_Loga
  Scenario: Search and select two product and then remove one product from card
    Given The user launches the chrome browser
    When The user opens the login page
    Then The user Search and select two products
    Then The user remove one product from card

  @TC04_Loga
  Scenario: Search then select and compare two product in Your Loga Application
    Given The user launches a chrome browser
    When The user opens a login page
    Then The user Search and Select two products
    Then The user compare two product

  @TC05_Loga
  Scenario: Invalid Login in Your Loga Application
    Given The user launch a chrome browser
    When The user open a login page
    Then The user click sign in
    Then The user enter invalid details
    Then The user click sigin in button and print error message in the console

  @TC06_Loga
  Scenario: Fill details in Contact Us in Loga application
    Given The user launch chrome application
    When The user open Contact Us page
    Then The user fills the details
    Then The user submit the details
    @TC07_Loga
    Scenario: To perform valid Registration
    Given The user launches an chrome browser
    When The user opens an login page
    Then The user email and click register
    Then The user enters all valid details
    Then The user clicks Register button
