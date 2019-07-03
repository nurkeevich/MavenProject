Feature: Global elements 
   @any
   Scenario: Click each global element buttons
      Given User navigates to "https://learn.letskodeit.com/p/practice" practice page
      Then Verifies Practice button is displayed
      Then Verifies Login button is displayed
      Then Verifies Sign Up button is displayed

   @test2
   Scenario: Switch To Alert test scenario
      Given User locates Switch to Alert Button using Xpath and enters credentials
      When User clicks the  button for alert popup box
      Then User gets the displayed text of the alert popup and prints it to console
      And User accepts the alert popup
      Then User locates Confirm Button using Xpath and User dismisses the confirm popup
      And User accepts the confirm popup
