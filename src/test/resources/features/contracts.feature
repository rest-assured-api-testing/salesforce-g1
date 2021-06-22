Feature: Contracts
  Description
  Scenario: Get a single Contract
    Given I build a "GET" request for a single Contract
    When I execute the get single Contract request on "/Contract/{ContractId}" endpoint
    Then The response status code should be "OK" on get single Contract request

  Scenario: Get all Contracts
    Given I build a "GET" request for all Contracts
    When I execute the get all Contracts request on "/Contract" endpoint
    Then The response status code should be "OK" on get all Contracts request

  Scenario: Post a Contract
    Given I build a "POST" request for a Contract
    When I execute the post Contract request on "/Contract" endpoint
    Then The response status code should be "CREATED" on post Contract request

  Scenario: Patch a Contract
    Given I build a "PATCH" request for a Contract
    When I execute the patch Contract request on "/Contract/{ContractId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Contract request

  Scenario: Delete a Contract
    Given I build a "DELETE" request for a Contract
    When I execute the delete Contract request on "/Contract/{ContractId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Contract request