#Author: marshal.john10@gmail.com
Feature: Test Automation of Pet Store APIs
  Description: To automate the Pet Store APIs using Rest Assured
  Pet store Swagger URL: https://petstore.swagger.io/

  Scenario: User is searhing for available pets
    When The user is searching for available pets in the pet store
    Then The user is able to find the list of available pets
  
  Scenario: User is trying to add a pet
    When The user is trying to add a available pet to the store
    Then The user is able to add the new pet
  
  Scenario: User is trying to update a pet
    When The user is trying to update the status of the pet to Sold
    Then The user is able to update the pet
  
  Scenario: User is trying to delete a pet
    When The user is trying to delete the pet from the store
    Then The user is able to delete the pet