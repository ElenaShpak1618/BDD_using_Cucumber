#Author: Elena
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@sanity
Feature: To Test TestComplete Address Functionality

  Background: Successful login with Valid Input
  
    Given User navigating to Spreecom Login website page
    When User Enter the keyword "Elena@spree.com" in the useremail field
    And User Enter the keyword "Elena123" in the userpassword field
    And User click on Login1 Button
   # Then User should see "Logged in successfully" is displayed

  Scenario: Successful Creating Address
  
  And when I click to "Add new address" button
  Then User enters label, firstname, lastname, address1, city, state_id, zipcode, phone
  And User Click on Process Button in TestComplete
  Then User should see "New address has been successfully created" is displayed
   
    
