package stepDefinition;

import AmezonImplementation.Product;
import AmezonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;

	@Given("I have search field on Amezon Page")
	public void i_have_search_field_on_amezon_page() {
		System.out.println("Step 1: I am on search page");
	   
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	    System.out.println("Step 2: Search product with name : " +productName+ " Price: "+price);
	    
	    product =new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3:product " + productName + " is displayed");
		
		search = new Search();
		String name=search.displayProduct(product);
		System.out.println("searched product is : " +name);
	    
	}
	
}
