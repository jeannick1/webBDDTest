$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/LoginProfile.feature");
formatter.feature({
  "name": "login into nedbanks URL",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginProfile"
    }
  ]
});
formatter.scenario({
  "name": "Login into nedbank profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginProfile"
    }
  ]
});
formatter.step({
  "name": "login to nedbank",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicking  personal",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click  find now",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter pretoria in the  search bar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select pretoria urology hospital",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on ATM",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});