Feature: Orders
  Description
  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get a single Order
    Given I build a "GET" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "OK"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get all Orders
    Given I build a "GET" request
    When I execute the request on "/Order"
    Then The response status code should be "OK"

  @DeleteOrder
  Scenario: Post a Order
    Given I build a "POST" request
    When I create "Order" body with parameters
      | accountId | 0015e00000B0PtfAAF |
      | status | Draft |
      | effectiveDate | 2021-07-01 |
      | contractId | 8005e000000cIKBAA2 |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch a Order
    Given I build a "PATCH" request
    When I create body with parameters
      | featureType | Order |
      | effectiveDate | 2021-07-29 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "CREATED"

  @CreateAccount @CreateContract @CreateOrder @DeleteContract @DeleteAccount
  Scenario: Delete a Order
    Given I build a "DELETE" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "NO_CONTENT"