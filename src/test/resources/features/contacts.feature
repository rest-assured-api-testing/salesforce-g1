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
    When I create body with parameters
      | featureType | Contact |
      | lastName | Perez |
      | accountId | 0015e00000B0PtfAAF |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @CreateAndDeleteContact
  Scenario: Patch a Contact
    Given I build a "PATCH" request
    When I set body with parameters
      | featureType | Contact |
      | lastName | My Contact with name changed |
    And I execute the request with body on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "NO_CONTENT"

  @CreateContact
  Scenario: Delete a Contact
    Given I build a "DELETE" request
    When I execute the request on "/Contact/{ContactId}" endpoint and "ContactId" param
    Then The response status code should be "NO_CONTENT"