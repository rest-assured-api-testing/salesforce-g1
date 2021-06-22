Feature:  Assets
  Description
  Scenario: Get a single Asset
    Given I build "GET" request for a single Asset
    When I execute the get single Asset request on "/Asset/{AssetId}" endpoint
    Then The response status code should be "OK" on get single Asset request

  Scenario: Get all Assets
    Given I build a "GET" request for all Assets
    When I execute the get all Assets request on "/Asset" endpoint
    Then The response status code should be "OK" on get all Assets request

  Scenario: Post an Asset
    Given I build a "POST" request for an Asset
    When I execute the post Asset request on "/Asset" endpoint
    Then The response status code should be "CREATED" on post Asset request

  Scenario: Patch an Asset
    Given I build a "PATCH" request for an Asset
    When I execute the patch Asset request on "/Asset/{AssetId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Asset request

  Scenario: Delete an Asset
    Given I build a "DELETE" request for an Asset
    When I execute the delete Asset request on "/Asset/{AssetId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Asset request