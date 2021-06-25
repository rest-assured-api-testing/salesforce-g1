Feature:  Assets
  Description
  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Get a single Asset
#    Given I build "GET" request for a single Asset
#    When I execute the get single Asset request on "/Asset/{AssetId}" endpoint
#    Then The response status code should be "OK" on get single Asset request
    Given I build a "GET" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "OK"

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Get all Assets
#    Given I build a "GET" request for all Assets
#    When I execute the get all Assets request on "/Asset" endpoint
#    Then The response status code should be "OK" on get all Assets request
    Given I build a "GET" request
    When I execute the request on "/Asset"
    Then The response status code should be "OK"

  @DeleteAsset
  Scenario: Post an Asset
#    Given I build a "POST" request for an Asset
#    When I create Asset body with name "My Asset for testing"
#    And I execute the post Asset request on "/Asset" endpoint
#    Then The response status code should be "CREATED" on post Asset request
    Given I build a "POST" request
    When I create body with parameters
      | object | Asset |
      | name | My Asset for Testing |
      | accountId | 0015e00000B0PtfAAF |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"

  @CreateAsset @DeleteAsset
  Scenario: Patch an Asset
    Given I build a "PATCH" request for an Asset
    When I create Asset body with name "My Asset with changed name"
    And I execute the patch Asset request on "/Asset/{AssetId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Asset request

  @CreateAccount @CreateAsset @DeleteAccount
  Scenario: Delete an Asset
#    Given I build a "DELETE" request for an Asset
#    When I execute the delete Asset request on "/Asset/{AssetId}" endpoint
#    Then The response status code should be "NO CONTENT" on delete Asset request
    Given I build a "DELETE" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "NO_CONTENT"