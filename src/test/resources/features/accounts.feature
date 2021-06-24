Feature: Request for Accounts
  description

  Scenario: Get a Account
    Given I build "GET account" request
    When I execute "GET" method from "Account/{accountID}" request
    Then the response status code should be "OK"
