Feature: simple google search
 
   Scenario: searching selenium project site
  Given google home page
   When I type "seleniumhq"
   And I click search button
   Then I can see the term seleniumhq in the result page