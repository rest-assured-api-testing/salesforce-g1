Feature:  Assets
  Description
  @CreateAndDeleteAsset
  Scenario: Get a single Asset
    Given I build a "GET" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "OK"

  @CreateAndDeleteAsset
  Scenario: Get all Assets
    Given I build a "GET" request
    When I execute the request on "/Asset"
    Then The response status code should be "OK"

  @DeleteAsset
  Scenario: Post an Asset
    Given I build a "POST" request
    When I create body with parameters
      | featureType | Asset |
      | name | My Asset for Testing |
      | accountId | 0015e00000B0PtfAAF |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"

  @CreateAndDeleteAsset
  Scenario: Patch an Asset
    Given I build a "PATCH" request
    When I set body with parameters
      | featureType | Asset |
      | name | My Asset with name changed |
    And I execute the request with body on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAsset
  Scenario: Delete an Asset
    Given I build a "DELETE" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"