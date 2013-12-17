Feature: browser preparation
Scenario: prepare the browser
  Given a fresh browser window
   When I open "www.google.com"
   Then  i can see the google home page
   
 