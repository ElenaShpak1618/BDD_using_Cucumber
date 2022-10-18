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
#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test WeBorder Login functionality with multiple value

  Scenario Outline: Successful Login with multiple Valid Credentials
    #Scenario: Successful Login with Valid Credentials
    Given User is on WebOrder Home Page
    When User enters "<uname>" and "<upass>"
    And User click on the Login button
    Then User should be in Home page and Logout button should display

    Examples: With Multiple Data
      | uname    | upass    |  exp.ressult
      | Tester   | test     |  Invalid Login or Password
      | Tester   | test     |  Invalid Login or Password
      | Tester   | test     |  Invalid Login or Password
