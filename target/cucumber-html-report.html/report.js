$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/UserRegistration.feature");
formatter.feature({
  "name": "UserRegistration",
  "description": "I want to check ",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "UserRegistration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in home page",
  "keyword": "Given "
});
formatter.step({
  "name": "i click on register page",
  "keyword": "When "
});
formatter.step({
  "name": "I entered \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cemail\u003e\",\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the registration page displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "ahmed",
        "mohamed",
        "ahmed@test.com",
        "1234665"
      ]
    }
  ]
});
formatter.scenario({
  "name": "UserRegistration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.UserRegistration.the_user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on register page",
  "keyword": "When "
});
formatter.match({
  "location": "steps.UserRegistration.i_click_on_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered \"ahmed\",\"mohamed\",\"ahmed@test.com\",\"1234665\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.UserRegistration.i_entered(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the registration page displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});