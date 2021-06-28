Feature: Accounts
  Description
  @CreateAccount @DeleteAccount
  Scenario: Get a single Account
    Given I build a "GET" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get all Accounts
    Given I build a "GET" request
    When I execute the request on "/Account"
    Then The response status code should be "OK"

  @DeleteAccount
  Scenario: Post an Account
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | name | My Account with name changed |
    And I execute the request with body on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount
  Scenario: Delete an Account
    Given I build a "DELETE" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account's Id
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | id | 1000 |
    And I execute the request with body on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with negative number of employees
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | employees | -1                |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with 10 employees
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | employees | 10                |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

  @CreateAccount @DeleteAccount
  Scenario: Get a single Account with invalid Id
    Given I build a "GET" request
    When I execute the request on "/Account/{AccountId}" endpoint and "AccountId" param with "InvalidId" value
    Then The response status code should be "NOT_FOUND"

  @DeleteAccount
  Scenario: Post an Account with duplicated name
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | New Account used for testing |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

#  @DeleteAccount
#  Scenario: Post an Account with empty name
#    Given I build a "POST" request
#    When I create "Account" body with parameters
#      | name | [blank] |
#    And I execute the request on "/Account" endpoint
#    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account with empty name
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | name | [blank] |
    And I execute the request with body on "/Account/{AccountId}" endpoint and "AccountId" param
    Then The response status code should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with rating Hot
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | rating | Hot                  |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

  @DeleteAccount
  Scenario: Post an Account with invalid rating value
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | rating | Invalid Value        |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with type Prospect
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | type | Prospect                 |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

  @DeleteAccount
  Scenario: Post an Account with industry Agriculture
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | industry | Agriculture        |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "CREATED"

  @DeleteAccount
  Scenario: Post an Account with invalid industry value
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | industry | Invalid Value      |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with invalid type value
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account for Testing |
      | type | Invalid Value          |
    And I execute the request on "/Account" endpoint
    Then The response status code should be "BAD_REQUEST"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's compacts layouts
    Given I build a "GET" request
    When I execute the request on "/Account/describe/compactLayouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's approval layouts
    Given I build a "GET" request
    When I execute the request on "/Account/describe/approvalLayouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's layouts
    Given I build a "GET" request
    When I execute the request on "/Account/describe/layouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's description
    Given I build a "GET" request
    When I execute the request on "/Account/describe"
    Then The response status code should be "OK"