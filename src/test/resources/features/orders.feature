Feature: Orders
  Description
  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get a single Order
    Given I build a "GET" request
    When I execute request on "/Order/{OrderId}" with "OrderId"
    Then The response status should be "OK"
    And The response schema matches "schemas/getOrder.json"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get a single Order with invalid id
    Given I build a "GET" request
    When I execute request on "/Order/{OrderId}" with "OrderId" as "Invalid"
    Then The response status should be "NOT_FOUND"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Get all Orders
    Given I build a "GET" request
    When I execute the request on "/Order"
    Then The response status should be "OK"
    And The response schema matches "schemas/getAllOrders.json"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Post an Order
    Given I build a "POST" request
    When I create "Order" body with parameters
      | status | Draft |
      | effectiveDate | 2021-07-01 |
    And I execute request on "/Order"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"

  @CreateAccount @CreateContract @DeleteOrder @DeleteContract @DeleteAccount
  Scenario Outline: Post an Order with valid status
    Given I build a "POST" request
    When I create "Order" body with parameters
      | effectiveDate          | <effectiveDate>     |
      | status                 | <status>            |
    And I execute request on "/Order"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"
    Examples:
      | effectiveDate | status |
      | 2021-07-01    | Draft  |

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | effectiveDate | 2021-07-29 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order shipping postal code with max length
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | shippingPostalCode | 00000000000000000000 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order shipping postal code with more than max length = 20
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | shippingPostalCode | 000000000000000000000 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order billing postal code with max length
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | billingPostalCode | 00000000000000000000 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order billing postal code with more than max length = 20
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | billingPostalCode | 000000000000000000000 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order shipping city with max length
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | shippingCity | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order shipping city with more than max length = 40
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | shippingCity | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order billing city with max length
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | billingCity | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order  billing city with more than max length = 40
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | billingCity | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order shipping state with max length
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | shippingState | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order shipping state with more than max length = 80
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | shippingState | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order billing state with max length
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | billingState | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order billing state with more than max length = 80
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | billingState | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with Activated status is not possible when it does not have a product
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | status | Activated |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario Outline: Patch an Order with valid status
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | status                 | <status>            |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "NO_CONTENT"
    Examples:
      | status |
      | Draft  |

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid account id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | accountId | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid contract id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | contractId | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid owner id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | ownerId | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid customer authorized by id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | customerAuthorizedById | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid company authorized by id
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | companyAuthorizedById | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order id is not possible
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | id | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order order number is not possible
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | orderNumber | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order created by id is not possible
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | createdById | 21506451 |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid status
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | status | invalid |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with invalid effective date
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | effectiveDate | invalid |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteOrder @DeleteContract @DeleteAccount
  Scenario: Patch an Order with empty effective date
    Given I build a "PATCH" request
    When I create "Order" body with parameters
      | effectiveDate | [blank] |
    And I execute request on "/Order/{OrderId}" with "OrderId" and body
    Then The response status should be "BAD_REQUEST"

  @CreateAccount @CreateContract @CreateOrder @DeleteContract @DeleteAccount
  Scenario: Delete an Order
    Given I build a "DELETE" request
    When I execute request on "/Order/{OrderId}" with "OrderId"
    Then The response status should be "NO_CONTENT"

  @CreateAccount @CreateContract @CreateOrder @DeleteContract @DeleteAccount
  Scenario: Delete an Order with invalid id
    Given I build a "DELETE" request
    When I execute request on "/Order/{OrderId}" with "OrderId" as "Invalid"
    Then The response status should be "NOT_FOUND"