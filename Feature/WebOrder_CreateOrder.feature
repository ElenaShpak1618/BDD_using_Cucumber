#Author: Elena
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@sanity
Feature: To Test TestComplete Order Functionality

  Background: Successful login with Valid Input
    Given User navigating to Web Order website page
    When User Enter the keyword "Tester" in the username field
    And User Enter the keyword "test" in the password field
    And User click on Login Button
    Then User should see "Welcome, Tester!" is displayed
    Then User should see "List of AllOrders" is displayed

  Scenario: Successful Order in TestComplete App
    And User Clicks on Order link in TestComplete
    And User enters quantity, customer name, street, city, zip, card, card number, expire date in TestComplete
    And User Click on Process Button in TestComplete
    Then User should see order success message in TestComplete
    
