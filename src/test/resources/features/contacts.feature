Feature: Contacts
  Description
  @CreateContact @DeleteContact
  Scenario: Get a single Contact
    Given I build a "GET" request
    When I execute the request on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "OK"

  @CreateContact @DeleteContact
  Scenario: Get all Contacts
    Given I build a "GET" request
    When I execute the request on "/Contact"
    Then The response status code should be "OK"

  @DeleteContact
  Scenario: Post a Contact
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @CreateContact @DeleteContact
  Scenario: Patch a Contact
    Given I build a "PATCH" request
    When I set "Contact" body with parameters
      | lastName | My Contact with lastname changed |
    And I execute the request with body on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "NO_CONTENT"

  @CreateContact
  Scenario: Delete a Contact
    Given I build a "DELETE" request
    When I execute the request on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "NO_CONTENT"

  @CreateAccount @DeleteAccount
  Scenario: Get Contact's compacts layouts
    Given I build a "GET" request
    When I execute the request on "/Contact/describe/compactLayouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Contact's approval layouts
    Given I build a "GET" request
    When I execute the request on "/Contact/describe/approvalLayouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Contact's layouts
    Given I build a "GET" request
    When I execute the request on "/Contact/describe/layouts"
    Then The response status code should be "OK"

  @CreateAccount @DeleteAccount
  Scenario: Get Contact's description
    Given I build a "GET" request
    When I execute the request on "/Contact/describe"
    Then The response status code should be "OK"

  @CreateContact @DeleteContact
  Scenario: Patch a Contact's Id
    Given I build a "PATCH" request
    When I set "Contact" body with parameters
      | id | 1000 |
    And I execute the request with body on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "BAD_REQUEST"

  @CreateContact @DeleteContact
  Scenario: Get a single Contact with invalid Id
    Given I build a "GET" request
    When I execute the request on "/Contact/{ContactId}" endpoint and "ContactId" param with "InvalidId" value
    Then The response status code should be "NOT_FOUND"

  @DeleteContact
  Scenario: Post a Contact with repeated lastName
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | last name from java |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @CreateContact @DeleteContact
  Scenario: Patch a Contact with empty name
    Given I build a "PATCH" request
    When I set "Contact" body with parameters
      | lastName | [blank] |
    And I execute the request with body on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "BAD_REQUEST"

  @DeleteContact
  Scenario: Post a Contact with Mr. in salutation
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | salutation | Mr.               |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @DeleteContact
  Scenario: Post a Contact with invalid value in salutation
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | salutation | Invalid value     |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteContact
  Scenario: Post a Contact with Web in lead source
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | leadSource | Web               |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @DeleteContact
  Scenario: Post a Contact with invalid value in lead source
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | leadSource | Invalid value     |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteContact
  Scenario: Post a Contact with 1989-06-28 in birthdate
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | birthdate | 1989-06-28         |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @DeleteContact
  Scenario: Post a Contact with invalid birthdate 2021-06-31
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | birthdate | 2021-06-31         |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteContact
  Scenario: Post a Contact with language level Primary
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | level__c | Primary         |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @DeleteContact
  Scenario: Post a Contact with invalid language level
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | lastName | My contact lastname for testing |
      | level__c | Invalid value         |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"

  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"
    Examples:
      | firstName                                 | lastName |
      | example name                              | lastname |
      | 0123456789012345678901234567890123456789  | lastname |
      | first name first name first name first n  | lastname |
      | example name | 0123456789012345678901234567890123456789 |
      | example name | first name first name first name first n |

  @DeleteContact
  Scenario Outline: Post a Contact with long firstname and lastname
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"
    Examples:
      | firstName     | lastName          |
      |               | example last name |
      | example name  | !#$%%             |


  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname and birthdate values
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | birthdate | <birthdate> |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"
    Examples:
      | firstName    | lastName          | birthdate  |
      | example name | example last name | 1999-33-01 |
      | example name | example last name | 1999-01-33 |
      | example name | example last name |            |
      | example name | example last name | 1900-01-01 |


  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname and birthdate values corrects
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | birthdate | <birthdate> |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"
    Examples:
      | firstName    | lastName          | birthdate  |
      | example name | example last name | 1999-01-01 |

  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname and phone incorrect
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | phone     | <phone> |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"
    Examples:
      | firstName    | lastName          | phone                |
      | example name | example last name | 12345678901234567890 |
      | example name | example last name | anytext              |
      | example name | example last name | !^#$%^               |
      | example name | example last name |                      |

  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname and phone correct
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | phone     | <phone> |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"
    Examples:
      | firstName    | lastName          | phone                |
      | example name | example last name | 44444444             |
      | example name | example last name | 123456789012345      |
      | example name | example last name | 1234567890123456789  |
      | example name | example last name | null                 |

  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname and email correct
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | email     | <email> |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"
    Examples:
      | firstName | lastName | email          |
      | firstname | lastname | email@mail.com |


  @DeleteContact
  Scenario Outline: Post a Contact with firstname and lastname and email incorrect
    Given I build a "POST" request
    When I create "Contact" body with parameters
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | email     | <email> |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "BAD_REQUEST"
    Examples:
      | firstName | lastName | email                       |
      | firstname | lastname |                             |