Feature: Contracts
  Description
  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get a single Contract
    Given I build a "GET" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "OK"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get all Contracts
    Given I build a "GET" request
    When I execute the request on "/Contract"
    Then The response status code should be "OK"

  @DeleteContract
  Scenario: Post a Contract
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | accountId | 0015e00000B0PtfAAF |
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract
    Given I build a "PATCH" request
    When I set body with parameters
      | featureType | Contract |
      | contractTerm | 7 |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteAccount
  Scenario: Delete a Contract
    Given I build a "DELETE" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"