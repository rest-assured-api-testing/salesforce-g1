Feature: Orders
  Description
  Scenario: Get a single Order
    Given I build a "GET" request for a single Order
    When I execute the get single Order request on "/Order/{OrderId}" endpoint
    Then The response status code should be "OK" on get single Order request

  Scenario: Get all Orders
    Given I build a "GET" request for all Orders
    When I execute the get all Orders request on "/Order" endpoint
    Then The response status code should be "OK" on get all Orders request

  Scenario: Post a Order
    Given I build a "POST" request for a Order
    When I execute the post Order request on "/Order" endpoint
    Then The response status code should be "CREATED" on post Order request

  Scenario: Patch a Order
    Given I build a "PATCH" request for a Order
    When I execute the patch Order request on "/Order/{OrderId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Order request

  Scenario: Delete a Order
    Given I build a "DELETE" request for a Order
    When I execute the delete Order request on "/Order/{OrderId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Order request