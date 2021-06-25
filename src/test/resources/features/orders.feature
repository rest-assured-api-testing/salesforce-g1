Feature: Orders
  Description
  @CreateAndDeleteOrder
  Scenario: Get a single Order
#    Given I build a "GET" request for a single Order
#    When I execute the get single Order request on "/Order/{OrderId}" endpoint
#    Then The response status code should be "OK" on get single Order request
    Given I build a "GET" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "OK"

  @CreateAndDeleteOrder
  Scenario: Get all Orders
#    Given I build a "GET" request for all Orders
#    When I execute the get all Orders request on "/Order" endpoint
#    Then The response status code should be "OK" on get all Orders request
    Given I build a "GET" request
    When I execute the request on "/Order"
    Then The response status code should be "OK"

  @DeleteOrder
  Scenario: Post a Order
#    Given I build a "POST" request for a Order
#    When I create Order body with start date "29/06/2021"
#    And I execute the post Order request on "/Order" endpoint
#    Then The response status code should be "CREATED" on post Order request
    Given I build a "POST" request
    When I create body with parameters
      | featureType | Order |
      | accountId | 0015e00000B0PtfAAF |
      | status | Draft |
      | effectiveDate | 2021-07-01 |
      | contractId | 8005e000000cIKBAA2 |
    And I execute the request on "/Order" endpoint
    Then The response status code should be "CREATED"

  @CreateAndDeleteOrder
  Scenario: Patch a Order
#    Given I build a "PATCH" request for a Order
#    When I create Order body with start date "30/06/2021"
#    And I execute the patch Order request on "/Order/{OrderId}" endpoint
#    Then The response status code should be "NO CONTENT" on patch Order request
    Given I build a "PATCH" request
    When I create body with parameters
      | featureType | Order |
      | effectiveDate | 2021-07-02 |
    And I execute the request with body on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "CREATED"

  @CreateOrder
  Scenario: Delete a Order
#    Given I build a "DELETE" request for a Order
#    When I execute the delete Order request on "/Order/{OrderId}" endpoint
#    Then The response status code should be "NO CONTENT" on delete Order request
    Given I build a "DELETE" request
    When I execute the request on "/Order/{OrderId}" endpoint and "OrderId" param
    Then The response status code should be "NO_CONTENT"