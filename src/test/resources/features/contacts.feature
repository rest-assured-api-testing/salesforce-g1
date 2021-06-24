Feature: Contacts
  Description
  @CreateAndDeleteContact
  Scenario: Get a single Contact
    Given I build a "GET" request for a single Contact
    When I execute the get single Contact request on "/Contact/{ContactId}" endpoint
    Then The response status code should be "OK" on get single Contact request

  @CreateAndDeleteContact
  Scenario: Get all Contacts
    Given I build a "GET" request for all Contacts
    When I execute the get all Contacts request on "/Contact" endpoint
    Then The response status code should be "OK" on get all Contacts request

  @DeleteContact
  Scenario: Post a Contact
#    Given I build a "POST" request for a Contact
#    When I create Contact body with name "My Contact for testing"
#    And I execute the post Contact request on "/Contact" endpoint
#    Then The response status code should be "CREATED" on post Contact request
    Given I build a "POST" request
    When I create body with parameters
      | object | Contact |
      | lastName | Perez |
      | accountId | 0015e00000B0PtfAAF |
    And I execute the request on "/Contact" endpoint
    Then The response status code should be "CREATED"

  @CreateAndDeleteContact
  Scenario: Patch a Contact
    Given I build a "PATCH" request for a Contact
    When I create Contact body with name "My Contact with changed name"
    And I execute the patch Contact request on "/Contact/{ContactId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Contact request

  @CreateContact
  Scenario: Delete a Contact
    Given I build a "DELETE" request for a Contact
    When I execute the delete Contact request on "/Contact/{ContactId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Contact request