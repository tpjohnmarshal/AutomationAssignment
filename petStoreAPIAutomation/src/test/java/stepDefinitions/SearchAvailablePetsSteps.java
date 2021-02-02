package stepDefinitions;

import org.junit.Assert;

import apiEngine.IRestResponse;
import apiEngine.models.responses.Pets;
import cucumberContexts.TestContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * Step Definitions for Search Available Pet Request
 */
public class SearchAvailablePetsSteps extends BaseStep {
	public SearchAvailablePetsSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^The user is searching for available pets in the pet store$")
	public void the_user_is_searching_for_available_pets_in_the_pet_store() {
		logger.info("Executing Search Availabe Pets Test");
		IRestResponse<Pets> pets = getEndPoints().getPets();
		getScenarioContext().setContext(Context.PETS, pets);
	}
	
	@Then("^The user is able to find the list of available pets$")
	public void the_user_is_able_to_find_the_list_of_available_pets() {
		@SuppressWarnings("unchecked")
		IRestResponse<Pets> petsResponse = (IRestResponse<Pets>) getScenarioContext().getContext(Context.PETS);
		logger.info("Search Availabe Pet Test Verifified");
		Assert.assertEquals(200, petsResponse.getStatusCode());
	}

}
