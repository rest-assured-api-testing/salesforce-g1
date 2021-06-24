Feature: Accounts
  Description
  @CreateAndDeleteAccount
  Scenario: Get a single Account
    Given I build a "GET" request for a single Account
    When I execute the get single Account request on "/Account/{AccountId}" endpoint
    Then The response status code should be "OK" on get single Account request

  @CreateAndDeleteAccount
  Scenario: Get all Accounts
    Given I build a "GET" request for all Accounts
    When I execute the get all Accounts request on "/Account" endpoint
    Then The response status code should be "OK" on get all Accounts request

  @DeleteAccount
  Scenario: Post an Account
    Given I build a "POST" request for an Account
    When I create Account body with name "My Account for testing"
    And I execute the post Account request on "/Account" endpoint
    Then The response status code should be "CREATED" on post Account request

  @CreateAndDeleteAccount
  Scenario: Patch an Account
    Given I build a "PATCH" request for an Account
    When I create Account body with name "My Account with changed name"
    And I execute the patch Account request on "/Account/{AccountId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Account request

  @CreateAccount
  Scenario: Delete an Account
    Given I build a "DELETE" request for an Account
    When I execute the delete Account request on "/Account/{AccountId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Account request