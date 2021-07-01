Feature: Accounts
  Description
  @CreateAccount @DeleteAccount
  Scenario: Get a single Account
    Given I build a "GET" request
    When I execute request on "/Account/{AccountId}" with "AccountId"
    Then The response status should be "OK"
    And The response schema matches "schemas/getAccount.json"

  @CreateAccount @DeleteAccount
  Scenario: Get all Accounts
    Given I build a "GET" request
    When I execute the request on "/Account"
    Then The response status should be "OK"
    And The response schema matches "schemas/getAllAccounts.json"

  @DeleteAccount
  Scenario: Post an Account
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
    And I execute request on "/Account"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | name | My Account with name changed |
    And I execute request on "/Account/{AccountId}" with "AccountId" and body
    Then The response status should be "NO_CONTENT"

  @CreateAccount
  Scenario: Delete an Account
    Given I build a "DELETE" request
    When I execute request on "/Account/{AccountId}" with "AccountId"
    Then The response status should be "NO_CONTENT"

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account's Id
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | id | 1000 |
    And I execute request on "/Account/{AccountId}" with "AccountId" and body
    Then The response status should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with negative number of employees
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
      | employees | -1 |
    And I execute request on "/Account"
    Then The response status should be "BAD_REQUEST"

  @DeleteAccount
  Scenario: Post an Account with 10 employees
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
      | employees | 10 |
    And I execute request on "/Account"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"

  @CreateAccount @DeleteAccount
  Scenario: Get a single Account with invalid Id
    Given I build a "GET" request
    When I execute request on "/Account/{AccountId}" with "AccountId" as "InvalidId"
    Then The response status should be "NOT_FOUND"

  @DeleteAccount
  Scenario: Post an Account with duplicated name
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
    And I execute request on "/Account"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"

  @CreateAccount @DeleteAccount
  Scenario: Patch an Account with empty name
    Given I build a "PATCH" request
    When I set "Account" body with parameters
      | name | [blank] |
    And I execute request on "/Account/{AccountId}" with "AccountId" and body
    Then The response status should be "BAD_REQUEST"

  @DeleteAccount
  Scenario Outline: Post an Account with valid ratings
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | <name> |
      | rating | <rating> |
    And I execute request on "/Account"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"
    Examples:
      | name | rating |
      | My Account to test | Hot |
      | My Account to test | Warm |
      | My Account to test | Cold |

  @DeleteAccount
  Scenario: Post an Account with invalid rating value
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
      | rating | Invalid Value |
    And I execute request on "/Account"
    Then The response status should be "BAD_REQUEST"

  @DeleteAccount
  Scenario Outline: Post an Account with valid type
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | <name> |
      | type | <type> |
    And I execute request on "/Account"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"
    Examples:
      | name | type |
      | My Account to test | Prospect |
      | My Account to test | Customer - Direct |
      | My Account to test | Customer - Channel |
      | My Account to test | Channel Partner / Reseller |
      | My Account to test | Installation Partner |
      | My Account to test | Technology Partner |
      | My Account to test | Other |

  @DeleteAccount
  Scenario: Post an Account with invalid type value
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
      | type | Invalid Value |
    And I execute request on "/Account"
    Then The response status should be "BAD_REQUEST"

  @DeleteAccount
  Scenario Outline: Post an Account with industry Agriculture
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | <name> |
      | industry | <industry> |
    And I execute request on "/Account"
    Then The response status should be "CREATED"
    And The response schema matches "schemas/postSuccess.json"
    Examples:
      | name | industry |
      | My Account to test | Agriculture |
      | My Account to test | Apparel |
      | My Account to test | Banking |
      | My Account to test | Biotechnology |
      | My Account to test | Chemicals |
      | My Account to test | Communications |
      | My Account to test | Construction |
      | My Account to test | Consulting |
      | My Account to test | Education |
      | My Account to test | Electronics |
      | My Account to test | Energy |
      | My Account to test | Engineering |
      | My Account to test | Entertainment |
      | My Account to test | Environmental |
      | My Account to test | Finance |
      | My Account to test | Food & Beverage |
      | My Account to test | Government |
      | My Account to test | Healthcare |
      | My Account to test | Hospitality |
      | My Account to test | Insurance |
      | My Account to test | Machinery |
      | My Account to test | Manufacturing |
      | My Account to test | Media |
      | My Account to test | Not For Profit |
      | My Account to test | Recreation |
      | My Account to test | Retail |
      | My Account to test | Shipping |
      | My Account to test | Technology |
      | My Account to test | Telecommunications |
      | My Account to test | Transportation |
      | My Account to test | Utilities |
      | My Account to test | Other |

  @DeleteAccount
  Scenario: Post an Account with invalid industry value
    Given I build a "POST" request
    When I create "Account" body with parameters
      | name | My Account to test |
      | industry | Invalid Value      |
    And I execute request on "/Account"
    Then The response status should be "BAD_REQUEST"


  @CreateAccount @DeleteAccount
  Scenario: Get Account's compacts layouts
    Given I build a "GET" request
    When I execute the request on "/Account/describe/compactLayouts"
    Then The response status should be "OK"
    And The response schema matches "schemas/getAccountCompactLayout.json"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's approval layouts
    Given I build a "GET" request
    When I execute the request on "/Account/describe/approvalLayouts"
    Then The response status should be "OK"
    And The response schema matches "schemas/approvalLayout.json"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's layouts
    Given I build a "GET" request
    When I execute the request on "/Account/describe/layouts"
    Then The response status should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Account's description
    Given I build a "GET" request
    When I execute the request on "/Account/describe"
    Then The response status should be "OK"