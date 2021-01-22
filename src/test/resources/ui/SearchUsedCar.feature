@regression @smoke @search
Feature: Verify correct data is showing when we search used cars

  Background: Navigating to Web application
    Given User navigates to "URL" application

  @TEC-0001
  Scenario: Log in functionality with valid credentials
    Given User enters car search "carInformation" specification
    Then User click search
