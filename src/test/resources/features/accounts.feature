Feature: Accounts
  Description
  @CreateAndDeleteAccount
  Scenario: Get a single Account
    Given I build a "GET" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "OK"

  @CreateAndDeleteAccount
  Scenario: Get all Accounts
    Given I build a "GET" request
    When I execute the request on "/Account"
    Then The response status code should be "OK"

  @DeleteAccount
  Scenario: Post an Account
    Given I build a "POST" request
    When I create body with parameters
      | object | Account |
      | name | My Account for Testing |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

  @CreateAndDeleteAccount
  Scenario: Patch an Account
    Given I build a "PATCH" request
    When I set body with parameters
      | object | Account |
      | name | My Account with name changed |
    And I execute the request with body on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount
  Scenario: Delete an Account
    Given I build a "DELETE" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"
