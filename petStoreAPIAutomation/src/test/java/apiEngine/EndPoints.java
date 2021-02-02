package apiEngine;


import apiEngine.models.requests.AddPetRequest;
import apiEngine.models.responses.Pets;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class contains the logic to call end points. 
 * The constructor will take care of the common steps like request header setting
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class EndPoints {
	private final RequestSpecification request;
	private String api_key;

	public EndPoints(String baseUrl, String apiKey) {
		RestAssured.baseURI = baseUrl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		this.api_key=apiKey;
	}

	public IRestResponse<Pets> getPets() {
		Response response = request.queryParam("status","available").get(Route.pets());
		return new RestResponse(Pets.class, response);
	}
	
	public Response addPet(AddPetRequest addPetRequest) {
		Response response = request.body(addPetRequest).post(Route.pet());
		return response;
	}
	
	public Response deletePet(int petId) {
		request.header("Authorization", "API " + api_key);
		return request.delete(Route.updatePet(petId));
	}
}

