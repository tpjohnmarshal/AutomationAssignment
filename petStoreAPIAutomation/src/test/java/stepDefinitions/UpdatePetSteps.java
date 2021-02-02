package stepDefinitions;

import org.junit.Assert;

import cucumberContexts.TestContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class UpdatePetSteps extends BaseStep {
	private Response response; 
	
	public UpdatePetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^The user is trying to update the status of the pet to Sold$")
	public void the_user_is_trying_to_update_the_status_of_the_pet_to_Sold() {
		logger.info("Executing Update Pet Test");
		response = getUpdateEndPoints().updatePet(1);
		getScenarioContext().setContext(Context.PET_UPDATE_RESPONSE, response);
	}	
	
	
	@Then("^The user is able to update the pet$")
	public void the_user_is_able_to_update_the_pet() {
		if(response.getStatusCode() == 200){
			logger.info("Pet Updated Successfully");
			Assert.assertEquals(200, response.getStatusCode());
		}
		
		if(response.getStatusCode() == 404){
			logger.info("Not able to find the pet. Update Pet Unsuccessful");
			Assert.assertEquals(404, response.getStatusCode());
		}
		
	}
	
}
