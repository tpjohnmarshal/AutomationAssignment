package apiEngine;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 * This class contains the logic to call update end points. 
 * The constructor will take care of the common steps like request header setting
 */
public class UpdateEndPoints {
	private final RequestSpecification request;

	public UpdateEndPoints(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		request = RestAssured.given();
		request.header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	}
	
	public Response updatePet(int petId) {
		return request.formParam("name", "Angel Fish").formParam("status", "sold").post(Route.updatePet(petId));
	}
}
