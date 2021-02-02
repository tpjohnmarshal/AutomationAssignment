package stepDefinitions;

import org.junit.Assert;

import cucumberContexts.TestContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class DeletePetSteps extends BaseStep {
	private Response response; 
	public DeletePetSteps(TestContext testContext) {
		super(testContext);
	}
	
	@When("^The user is trying to delete the pet from the store$")
	public void the_user_is_trying_to_delete_the_pet_from_the_store() {
		logger.info("Executing Delete Pet Test");
		response = getEndPoints().deletePet(1);
		getScenarioContext().setContext(Context.PET_DELETE_RESPONSE, response);
	}
	
	@Then("^The user is able to delete the pet$")
	public void the_user_is_able_to_delete_the_pet() {
		if(response.getStatusCode() == 200){
			logger.info("Pet Deleted Successfully");
			Assert.assertEquals(200, response.getStatusCode());
		}
		if(response.getStatusCode() == 404){
			logger.info("Not able to find the Pet");
			Assert.assertEquals(404, response.getStatusCode());
		}
	}
}
