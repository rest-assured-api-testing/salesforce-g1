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
      | accountId | 0015e00000B0PtfAAF |
    And I execute the request on "/Asset" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @CreateAsset @DeleteAsset @DeleteAccount
  Scenario: Patch an Asset
    Given I build a "PATCH" request
    When I set body with parameters
      | featureType | Asset |
      | name | My Asset with name changed |
    And I execute the request with body on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @CreateAsset @DeleteAccount
  Scenario: Delete an Asset
    Given I build a "DELETE" request
    When I execute the request on "/Asset/{AssetId}" endpoint and "AssetId" param
    Then The response status code should be "NO_CONTENT"