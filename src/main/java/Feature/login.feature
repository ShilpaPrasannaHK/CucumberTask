Feature: Amezon Search

@Smoke
Scenario: Search a Apple MAcBook
Given I have search field on Amezon Page
When I search for a product with name "Apple MacBook Pro" and price 1200
Then Product with name "Apple MAcBook Pro" should be displayed

@Regression
Scenario: Search a Iphone
Given I have search field on Amezon Page
When I search for a product with name "Iphone" and price 1000
Then Product with name "Iphone" should be displayed


 