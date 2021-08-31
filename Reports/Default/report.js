$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test22.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7976619800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test web Application",
  "description": "",
  "id": ";test-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open Zedy3d i get the title \u0027Home\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on the contact button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "fill out the form with name \u0027Johnny\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "fill email \u0027john@example.com\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 29
    }
  ],
  "location": "SDLanding.mut(String)"
});
formatter.result({
  "duration": 607689000,
  "status": "passed"
});
formatter.match({
  "location": "SDLanding.searchWeb()"
});
formatter.result({
  "duration": 1332061100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Johnny",
      "offset": 29
    }
  ],
  "location": "SDLanding.fill(String)"
});
formatter.result({
  "duration": 257872000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john@example.com",
      "offset": 12
    }
  ],
  "location": "SDLanding.fillEmail(String)"
});
formatter.result({
  "duration": 156819099,
  "status": "passed"
});
formatter.after({
  "duration": 755410899,
  "status": "passed"
});
});