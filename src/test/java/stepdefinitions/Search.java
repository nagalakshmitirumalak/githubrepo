package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	@Given("^I visit the website as a guest user$")
	public void i_visit_the_website_as_a_guest_user() {
		
		System.out.println(">>- Given - I visit the website as a guest user Yes This is Lakshmi");
		
	}

	@When("^I select the books option from the search dropdown$")
	public void i_select_the_books_option_from_the_search_dropdown() {
		
		System.out.println(">>- When - I select the books option from the search dropdown No This is not done by me");
		
	}
	
	@When("^I select the baby option from the search button$")
	public void i_select_the_baby_option_from_the_search_button() {
		
		System.out.println(">>- When - I select the baby option from the search button Hello everybody");
	}
	
	@And("^I click on search icon option$")
	public void i_click_on_search_icon_option() {
		System.out.println(">>- And - I click on search icon option");
	}
	
	@Then("^I should see the page having heading as Amazon Best Reads$")
	public void i_should_see_the_page_having_heading_as_Amazon_Best_Reads() {
		System.out.println(">>- Then - I should see the page having heading as Amazon Best Reads");
	}
	
	@Then("^I should see the page having heading as Offers on Baby products$")
	public void i_should_see_the_page_having_heading_as_Offers_on_Baby_products() {
		System.out.println(">>- Then - I should see the page having heading as Offers on Baby products");
	}
	
	@But("I should not see the other category products")
	public void i_should_not_see_the_other_category_products() {
		System.out.println(">>- But - I should not see the other category products");
	}
	
}
