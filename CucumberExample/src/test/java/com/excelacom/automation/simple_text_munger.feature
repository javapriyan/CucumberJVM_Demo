Feature: simple google search
Scenario: open the browser
  Given a fresh browser window
   When I open "www.google.com"
   Then  i can see the google home page
   
   Scenario: searching selenium project site
  Given google home page
   When I type "seleniumhq"
   And I click search button
   Then I can see the term seleniumhq in the result page