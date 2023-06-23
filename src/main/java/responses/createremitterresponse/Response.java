package responses.createremitterresponse;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
     private String responseId;
     private String status;
     private List<Error> errors;
     private Result result;
     private String new_remitter_id;
     
	public String getNew_remitter_id() {
		return new_remitter_id;
	}
	public void setNew_remitter_id(String new_remitter_id) {
		this.new_remitter_id = new_remitter_id;
	}
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Error> getErrors() {
		return errors;
	}
	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
     
     
}
