Feature: Contracts
  Description
  @CreateAndDeleteContract
  Scenario: Get a single Contract
    Given I build a "GET" request for a single Contract
    When I execute the get single Contract request on "/Contract/{ContractId}" endpoint
    Then The response status code should be "OK" on get single Contract request

  @CreateAndDeleteContract
  Scenario: Get all Contracts
    Given I build a "GET" request for all Contracts
    When I execute the get all Contracts request on "/Contract" endpoint
    Then The response status code should be "OK" on get all Contracts request

  @DeleteContract
  Scenario: Post a Contract
    Given I build a "POST" request for a Contract
    When I create Contract body with start date "25/06/2021"
    And I execute the post Contract request on "/Contract" endpoint
    Then The response status code should be "CREATED" on post Contract request

  @CreateAndDeleteContract
  Scenario: Patch a Contract
    Given I build a "PATCH" request for a Contract
    When I create Contract body with start date "28/06/2021"
    And I execute the patch Contract request on "/Contract/{ContractId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Contract request

  @CreateContract
  Scenario: Delete a Contract
    Given I build a "DELETE" request for a Contract
    When I execute the delete Contract request on "/Contract/{ContractId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Contract request