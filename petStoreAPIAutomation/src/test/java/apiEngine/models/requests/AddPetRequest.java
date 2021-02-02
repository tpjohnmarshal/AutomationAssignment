package apiEngine.models.requests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * This java class has the logic to prepare the payload for Add Pet request
 */

public class AddPetRequest {
	
	public String petBody;
	
	public AddPetRequest(){
		String jsonBody = generateStringFromResource("resources/jsons/Pet.json");
		this.petBody = jsonBody;
	}
	
	
	/*
	 * Method to read the json from the resources directory
	 */	
	public String generateStringFromResource(String path) {

	    try {
			return new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
}
