package apiEngine.models.responses;


/*
 * POJO class for Delete Pet Response
 */
public class DeletePet {
	public String code;
	public String type;
	public String message;
	
	public DeletePet(String code, String type, String message) {
	this.code = code;
	this.type = type;
	this.message = message;
	}
}
