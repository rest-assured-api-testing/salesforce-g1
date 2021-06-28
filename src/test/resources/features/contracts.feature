Feature: Contracts
  Description
  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get a single Contract
    Given I build a "GET" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "OK"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get a single Contract with invalid Id
    Given I build a "GET" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param with "Invalid" value
    Then The response status code should be "NOT_FOUND"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get all Contracts
    Given I build a "GET" request
    When I execute the request on "/Contract"
    Then The response status code should be "OK"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract with valid owner expiration notice
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
      | ownerExpirationNotice | 15 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract with invalid owner expiration notice
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
      | ownerExpirationNotice | 16 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract with negative owner expiration notice
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
      | ownerExpirationNotice | -15 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract with invalid start date
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | date |
      | contractTerm | 7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without start date
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | contractTerm | 7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without contract term
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without contract term nor start date
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract with empty star date
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | [blank] |
      | contractTerm | 7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract with negative contract term
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | -7 |
    And I execute the request on "/Contract" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | contractTerm | 7 |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with a invalid Account id
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | accountId | 7 |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract's id
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | id | 7 |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with negative contract term
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | contractTerm | -7 |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with valid status
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | status | Activated |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with invalid status
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | status | abcd |
    And I execute the request with body on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteAccount
  Scenario: Delete a Contract
    Given I build a "DELETE" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteAccount
  Scenario: Delete a Contract with invalid id
    Given I build a "DELETE" request
    When I execute the request on "/Contract/{ContractId}" endpoint and "ContractId" param with "Invalid" value
    Then The response status code should be "NOT_FOUND"