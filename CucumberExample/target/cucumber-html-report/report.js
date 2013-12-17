$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027basic_browser_preparation.feature\u0027");
formatter.feature({
  "id": "browser-preparation",
  "description": "",
  "name": "browser preparation",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "browser-preparation;prepare-the-browser",
  "description": "",
  "name": "prepare the browser",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "a fresh browser window",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "I open \"www.google.com\"",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "i can see the google home page",
  "keyword": "Then ",
  "line": 5
});
formatter.match({
  "location": "SimpleTextMungerStepsdef.open_the_browser()"
});
formatter.result({
  "duration": 2969372887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.google.com",
      "offset": 8
    }
  ],
  "location": "SimpleTextMungerStepsdef.get_url(String)"
});
formatter.result({
  "duration": 8321195154,
  "status": "passed"
});
formatter.match({
  "location": "SimpleTextMungerStepsdef.I_can_see_the_google_home_page()"
});
formatter.result({
  "duration": 60410479,
  "status": "passed"
});
formatter.uri("\u0027search_story.feature\u0027");
formatter.feature({
  "id": "simple-google-search",
  "description": "",
  "name": "simple google search",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "simple-google-search;searching-selenium-project-site",
  "description": "",
  "name": "searching selenium project site",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "google home page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I type \"seleniumhq\"",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I click search button",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "I can see the term seleniumhq in the result page",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "SimpleTextMungerStepsdef.google_homepage()"
});
formatter.result({
  "duration": 45717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "seleniumhq",
      "offset": 8
    }
  ],
  "location": "SimpleTextMungerStepsdef.i_type(String)"
});
formatter.result({
  "duration": 540122143,
  "status": "passed"
});
formatter.match({
  "location": "SimpleTextMungerStepsdef.i_click_search_button()"
});
formatter.result({
  "duration": 1129746077,
  "status": "passed"
});
formatter.match({
  "location": "SimpleTextMungerStepsdef.I_can_see_the_term_seleniumhq_in_the_result_page()"
});
formatter.result({
  "duration": 5153134941,
  "status": "passed"
});
});