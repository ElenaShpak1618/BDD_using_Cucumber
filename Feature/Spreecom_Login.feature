#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@webdriver
Feature: To Test Spreecom Login Fucntionality

  @smoke
  Scenario: Successful login with Valid Input
    Given User navigating to Spreecom Login website page
    When User Enter the keyword "Elena@spree.com" in the useremail field
    And User Enter the keyword "Elena123" in the userpassword field
    And User click on Login Button of Spreecom
   # Then User should see "Logged in successfully" is displayed
    


 
# Scenario: 
   
 
