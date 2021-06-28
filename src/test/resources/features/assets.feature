Feature:  Assets
  Description
  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Get a single Asset
    Given I build a "GET" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "OK"

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

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with Shipped status
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | status | Shipped |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with invalid status value
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | status | Invalid value |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with 2021-06-28 install date
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | installDate | 2021-06-28 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @DeleteAsset @DeleteAccount
  Scenario: Post an Asset with invalid install date 2021-06-31
    Given I build a "POST" request
    When I create "Asset" body with parameters
      | name | My Asset for Testing |
      | installDate | 2021-06-31 |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "BAD_REQUEST"