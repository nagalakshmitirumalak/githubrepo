Feature: Search of various product categories should be possible along with product search

@Regression @All @Books
Scenario: User should be able to search for the products under books category
Given I visit the website as a guest user
When I select the books option from the search dropdown
And I click on search icon option
Then I should see the page having heading as Amazon Best Reads
But I should not see the other category products

@Smoke @All @Baby
Scenario: User should be able to search for the products under baby category
Given I visit the website as a guest user
When I select the baby option from the search button
And I click on search icon option
Then I should see the page having heading as Offers on Baby products
But I should not see the other category products