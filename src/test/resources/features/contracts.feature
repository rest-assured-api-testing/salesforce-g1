Feature: Contracts
  Description
  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get a single Contract
    Given I build a "GET" request
    When I execute request on "/Contract/{ContractId}" with "ContractId"
    Then The response status should be "OK"
    And The response schema matches "schemas/getContract.json"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get a single Contract with invalid Id
    Given I build a "GET" request
    When I execute request on "/Contract/{ContractId}" with "ContractId" as "Invalid"
    Then The response status should be "NOT_FOUND"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Get all Contracts
    Given I build a "GET" request
    When I execute the request on "/Contract"
    Then The response status should be "OK"
    And The response schema matches "schemas/getAllContract.json"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
    And I execute request on "/Contract"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario Outline: Post a Contract with valid owner expiration notice
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | <status> |
      | startDate | <startDate> |
      | contractTerm | <contractTerm> |
      | ownerExpirationNotice | <ownerExpirationNotice> |
    And I execute request on "/Contract"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"
    Examples:
      | status | startDate | contractTerm | ownerExpirationNotice |
      | Draft  | 2021-06-28 | 5           | 15                    |
      | Draft  | 2021-06-28 | 5           | 30                    |
      | Draft  | 2021-06-28 | 5           | 45                    |
      | Draft  | 2021-06-28 | 5           | 60                    |
      | Draft  | 2021-06-28 | 5           | 90                    |
      | Draft  | 2021-06-28 | 5           | 120                   |

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without status
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | startDate | 2021-06-28 |
      | contractTerm | 7 |
    And I execute request on "/Contract"
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without start date
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | contractTerm | 7 |
    And I execute request on "/Contract"
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without contract term
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
      | startDate | 2021-06-28 |
    And I execute request on "/Contract"
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @DeleteContract @DeleteAccount
  Scenario: Post a Contract without contract term nor start date
    Given I build a "POST" request
    When I create "Contract" body with parameters
      | status | Draft |
    And I execute request on "/Contract"
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | contractTerm | 7 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with a invalid Account id
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | accountId | 7 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract contract number is not possible
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | contractNumber | 7 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract owner id is not possible
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | ownerId | 7 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract's id
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | id | 7 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with negative contract term
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | contractTerm | -7 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario Outline: Patch a Contract with valid status
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | status | <status> |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"
    Examples:
      | status |
      | Activated |
      | Draft     |

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario Outline: Patch a Contract with valid owner expiration notice
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | ownerExpirationNotice | <ownerExpirationNotice> |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"
    Examples:
      | ownerExpirationNotice |
      | 15                    |
      | 30                    |
      | 45                    |
      | 60                    |
      | 90                    |
      | 120                   |

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with invalid status
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | status | abcd |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with billing postal code with max length
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | billingPostalCode | 00000000000000000000 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with billing postal code with more than max length = 20
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | billingPostalCode | 000000000000000000000 |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with billing city code with max length
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | billingCity | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with billing city code with more than max length = 40
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | billingCity | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with billing state code with max length
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | billingState | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteContract @DeleteAccount
  Scenario: Patch a Contract with billing state code with more than max length = 80
    Given I build a "PATCH" request
    When I set "Contract" body with parameters
      | billingState | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteAccount
  Scenario: Delete a Contract
    Given I build a "DELETE" request
    When I execute request on "/Contract/{ContractId}" with "ContractId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @DeleteAccount
  Scenario: Delete a Contract with invalid id
    Given I build a "DELETE" request
    When I execute request on "/Contract/{ContractId}" with "ContractId" as "Invalid"
    Then The response status should be "NOT_FOUND"