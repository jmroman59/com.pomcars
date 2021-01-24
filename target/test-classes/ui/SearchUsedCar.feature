@regression @smoke @search
Feature: Verify correct data is showing when we search used cars

  @TEC-0001
  Scenario: carInformation filters are displayed
    Given User navigates to "URL" application
    When User enters car search "carInformation" specification
    Then User validate filters are displayed

  @TEC-0002
  Scenario: New/Used filter tags are displayed
    Given User click on new car filter
    Then User validate new filter is displayed

  @TEC-0003
  Scenario: Trim filter tag are displayed
    Given User click on trim type checkbox
    Then User validate trim tag is displayed

  @TEC-0004
  Scenario: Validate second car options
    Given User click on second car
    Then User validate information is displayed

  @TEC-0005
  Scenario: Contact seller information form
    Given User enters invalid contact information
    Then User is able to see error message

  @TEC-0006
  Scenario: Scroll down to payment calculator
    Given User scrolls down to view payment calculator
    Then User takes a screenshot
