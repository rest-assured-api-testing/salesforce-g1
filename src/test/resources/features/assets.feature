Feature:  Assets
  Description
  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Get a single Asset
    Given I build a "GET" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "OK"
    And The response schema matches "schemas/asset.json" schema

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Get all Assets
    Given I build a "GET" request
    When I execute the request on "/Asset"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Patch an Asset
    Given I build a "PATCH" request
    When I set "Asset" body with parameters
      | name | My Asset with name changed |
    And I execute the request with body on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateAsset @DeleteAccount
  Scenario: Delete an Asset
    Given I build a "DELETE" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @DeleteAccount
  Scenario: Get Asset's compacts layouts
    Given I build a "GET" request
    When I execute the request on "/Asset/describe/compactLayouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Asset's approval layouts
    Given I build a "GET" request
    When I execute the request on "/Asset/describe/approvalLayouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Asset's layouts
    Given I build a "GET" request
    When I execute the request on "/Asset/describe/layouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Asset's description
    Given I build a "GET" request
    When I execute the request on "/Asset/describe"
    Then The response status code should be "OK"

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Patch an Asset's Id
    Given I build a "PATCH" request
    When I set "Asset" body with parameters
      | id | 1000 |
    And I execute the request with body on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Get a single Asset with invalid Id
    Given I build a "GET" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param with "InvalidId" value
    Then The response status code should be "NOT_FOUND"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with repeated name
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | asset name from java |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Patch an Asset with empty name
    Given I build a "PATCH" request
    When I set "Asset" body with parameters
      | name | [blank] |
    And I execute the request with body on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with negative quantity
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | quantity | -10 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with 10 in quantity
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | quantity | 10 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with negative price
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | price | -10 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with 10 in price
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | price | 10 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario Outline: Post an Asset with valid status
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | <name> |
      | status | <status> |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema
    Examples:
      | name | status |
      | My Asset for Testing | Shipped |
      | My Asset for Testing | Installed |
      | My Asset for Testing | Registered |
      | My Asset for Testing | Obsolete |
      | My Asset for Testing | Purchased |

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with invalid status value
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | status | Invalid value |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with valid install date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | installDate | 2021-06-28 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with invalid install date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | installDate | 2021-06-31 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with valid purchase date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | purchaseDate | 2021-06-28 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with invalid purchase date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | purchaseDate | 2021-13-28 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with valid usage end date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | usageEndDate | 2021-06-28 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with invalid usage end date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | usageEndDate | 2021-13-35 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario Outline: Post an Asset with competitor asset status
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | <name> |
      | isCompetitorProduct | <isCompetitorProduct> |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"
    And The response schema matches "schemas/postRequest.json" schema
    Examples:
      | name | isCompetitorProduct |
      | My Asset for Testing | true |
      | My Asset for Testing | false |