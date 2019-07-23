@CleanStubby
Feature: Default
  This is feature test API pokemon

  Background:
    Given A have a mock pokeapi-detail for dependency pokeapi

  Scenario: Detail pokemon with success
    When I make a GET to api/v1/pokemon/132/ditto
    Then I expect to receive a 200 status with body response.json
    And I expect mock pokeapi-detail for dependency pokeapi to have been called 1 times
    And the table public.pokemon should have the following data:
      | id  | base_experience | height | name  | weight |
      | 132 | 101             | 3      | ditto | 40     |