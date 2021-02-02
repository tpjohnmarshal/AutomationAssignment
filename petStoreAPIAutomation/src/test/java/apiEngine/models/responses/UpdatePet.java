package apiEngine.models.responses;

/*
 * POJO class for Update Pet response
 */
public class UpdatePet {
	public Integer code;
	public String type;
	public String message;
	
	public UpdatePet(Integer code, String type, String message) {
	this.code = code;
	this.type = type;
	this.message = message;
	}
}
