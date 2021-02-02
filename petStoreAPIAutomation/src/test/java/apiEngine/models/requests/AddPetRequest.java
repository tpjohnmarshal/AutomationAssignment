package apiEngine.models.requests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddPetRequest {
	
	public String petBody;
	
	public AddPetRequest(){
		String jsonBody = generateStringFromResource("resources/jsons/Pet.json");
		this.petBody = jsonBody;
	}
	
	public String generateStringFromResource(String path) {

	    try {
			return new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
}
