@FunctionalFeature
Feature: to test bankrate mortgage calculator functionality

  Scenario: Validate that mortgage calculator is working as expected
    Given browser is open
    And user navigates to bankrate website
    When user clicks on the mortgage calculator page
    And user updates the value on boxes for: Home Price, Downpayment, Loan term, Interest Rate, and Zip Code
    Then user clicks on Taxes, Insurance, HOA fees text to expand more fields
    And user locates and enters values in the boxes for: Credit Score, Property Tax per Month, Homeowner's Insurance per month, PMI per month, and HOA fees per month
    Then user locates and clicks on the Update button




