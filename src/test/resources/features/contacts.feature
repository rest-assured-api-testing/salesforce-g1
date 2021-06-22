Feature: Contacts
  Description
  Scenario: Get a single Contact
    Given I build a "GET" request for a single Contact
    When I execute the get single Contact request on "/Contact/{ContactId}" endpoint
    Then The response status code should be "OK" on get single Contact request

  Scenario: Get all Contacts
    Given I build a "GET" request for all Contacts
    When I execute the get all Contacts request on "/Contact" endpoint
    Then The response status code should be "OK" on get all Contacts request

  Scenario: Post a Contact
    Given I build a "POST" request for a Contact
    When I execute the post Contact request on "/Contact" endpoint
    Then The response status code should be "CREATED" on post Contact request

  Scenario: Patch a Contact
    Given I build a "PATCH" request for a Contact
    When I execute the patch Contact request on "/Contact/{ContactId}" endpoint
    Then The response status code should be "NO CONTENT" on patch Contact request

  Scenario: Delete a Contact
    Given I build a "DELETE" request for a Contact
    When I execute the delete Contact request on "/Contact/{ContactId}" endpoint
    Then The response status code should be "NO CONTENT" on delete Contact request