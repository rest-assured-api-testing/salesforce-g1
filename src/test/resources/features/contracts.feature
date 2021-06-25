Feature: Contracts
  Description
  @CreateAndDeleteContract
  Scenario: Get a single Contract
#    Given I build a "GET" request for a single Contract
#    When I execute the get single Contract request on "/Contract/{ContractId}" endpoint
#    Then The response status code should be "OK" on get single Contract request
    Given I build a "GET" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "OK"

  @CreateAndDeleteContract
  Scenario: Get all Contracts
#    Given I build a "GET" request for all Contracts
#    When I execute the get all Contracts request on "/Contract" endpoint
#    Then The response status code should be "OK" on get all Contracts request
    Given I build a "GET" request
    When I execute the request on "/Contract"
    Then The response status code should be "OK"

  @DeleteContract
  Scenario: Post a Contract
#    Given I build a "POST" request for a Contract
#    When I create Contract body with start date "25/06/2021"
#    And I execute the post Contract request on "/Contract" endpoint
#    Then The response status code should be "CREATED" on post Contract request
    Given I build a "POST" request
    When I create body with parameters
      | featureType | Contract |
      | accountId | 0015e00000B0PtfAAF |
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "CREATED"

  @CreateAndDeleteContract
  Scenario: Patch a Contract
#    Given I build a "PATCH" request for a Contract
#    When I create Contract body with start date "28/06/2021"
#    And I execute the patch Contract request on "/Contract/{ContractId}" endpoint
#    Then The response status code should be "NO CONTENT" on patch Contract request
    Given I build a "PATCH" request
    When I set body with parameters
      | featureType | Contract |
      | contractTerm | 7 |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"

  @CreateContract
  Scenario: Delete a Contract
#    Given I build a "DELETE" request for a Contract
#    When I execute the delete Contract request on "/Contract/{ContractId}" endpoint
#    Then The response status code should be "NO CONTENT" on delete Contract request
    Given I build a "DELETE" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"