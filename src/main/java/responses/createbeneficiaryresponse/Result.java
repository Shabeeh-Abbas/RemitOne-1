package responses.createbeneficiaryresponse;

import java.util.List;

import responses.createremitterresponse.Error;

public class Result {
     
	private String message;
	 private List<Error> errors;
	 
	public List<Error> getErrors() {
		return errors;
	}
	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
