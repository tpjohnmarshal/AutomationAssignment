package stepDefinitions;

import org.junit.Assert;

import apiEngine.models.requests.AddPetRequest;
import cucumberContexts.TestContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class AddPetSteps extends BaseStep {
	private Response response;
	public AddPetSteps(TestContext testContext) {
		super(testContext);
	}

	
	@When("^The user is trying to add a available pet to the store$")
	public void the_user_is_trying_to_add_a_available_pet_to_the_store() {
		AddPetRequest addPetRequest = new AddPetRequest();
		response = getEndPoints().addPet(addPetRequest);
		logger.info("Executing Add Pet Test");
		getScenarioContext().setContext(Context.ADD_PET_RESPONSE, response);
	}
	
	@Then("^The user is able to add the new pet$")
	public void the_user_is_able_to_add_the_new_pet() {
		logger.info("Add Pet Test Verifified");
		Assert.assertEquals(200, response.getStatusCode());
	}
}
