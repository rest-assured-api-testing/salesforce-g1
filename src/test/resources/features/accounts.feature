Feature: Accounts
  Description
  @CreateAccount @DeleteAccount
  Scenario: Get a single Account
    Given I build a "GET" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "OK"
    And The response schema matches "schemas/getAccount.json" schema

  @CreateAccount @DeleteAccount
  Scenario: Get all Accounts
    Given I build a "GET" request
    When I execute the request on "/Account"
    Then The response status code should be "OK"
    And The response schema matches "schemas/getAllAccounts.json" schema

  @DeleteAccount
  Scenario: Post an Account
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | name | My Account with name changed |
    And I execute the request with body on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount
  Scenario: Delete an Account
    Given I build a "DELETE" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"
