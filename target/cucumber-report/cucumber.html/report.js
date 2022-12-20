$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login/LogOut Test",
  "description": "\r\nAs a user i want to check login/logout functionality of tutorial ninja website",
  "id": "login/logout-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage of tutorial ninja website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 8,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login/logout-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    },
    {
      "line": 7,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select \"Login\" option from my account options",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should navigate to login page successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});