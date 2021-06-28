Feature: Orders
  Description
  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get a single Order
    Given I build a "GET" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "OK"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get a single Order with invalid id
    Given I build a "GET" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param with "Invalid" value
    Then The response status code should be "NOT_FOUND"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get all Orders
    Given I build a "GET" request
    When I execute the request on "/Order"
    Then The response status code should be "OK"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Post an Order
    Given I build a "POST" request
    When I create "Order" body with parameters
      | status | Draft |
      | effectiveDate | 2021-07-01 |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Post an Order without status
    Given I build a "POST" request
    When I create "Order" body with parameters
      | effectiveDate | 2021-07-01 |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Post an Order without effective date
    Given I build a "POST" request
    When I create "Order" body with parameters
      | effectiveDate | 2021-07-01 |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Post an Order with invalid start date
    Given I build a "POST" request
    When I create "Order" body with parameters
      | status | Draft |
      | effectiveDate | date |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Post an Order with empty effective date
    Given I build a "POST" request
    When I create "Order" body with parameters
      | status | Draft |
      | effectiveDate | [blank] |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | effectiveDate | 2021-07-29 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with valid status
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | status | Activated |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid account id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | accountId | 21506451 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid contract id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | contractId | 21506451 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid owner id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | ownerId | 21506451 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order id is not possible
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | id | 21506451 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order order number is not possible
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | orderNumber | 21506451 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order created by id is not possible
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | createdById | 21506451 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid status
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | status | invalid |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid effective date
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | effectiveDate | invalid |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteContract @DeleteAccount
  Scenario: Delete an Order
    Given I build a "DELETE" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteContract @DeleteAccount
  Scenario: Delete an Order with invalid id
    Given I build a "DELETE" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param with "Invalid" value
    Then The response status code should be "NOT_FOUND"