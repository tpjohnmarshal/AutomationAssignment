package apiEngine;

import io.restassured.response.Response;

/*
 * This is a Generic Interface, and used to handle the responses received from server with several data types
 */
public interface IRestResponse<T> {
	public T getBody();

	public String getContent();

	public int getStatusCode();

	public boolean isSuccessful();

	public String getStatusDescription();

	public Response getResponse();

	public Exception getException();

}