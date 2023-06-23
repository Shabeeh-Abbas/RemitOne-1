package responses.createbeneficiaryresponse;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import responses.createremitterresponse.Error;
import responses.createremitterresponse.Result;

@XmlRootElement
public class Response {
     
	private String status;
	private String new_beneficiary_id;
	private List<Error> errors;
    private Result result;
    private String response_code;
    private Error_Data error_data;
	
    public Error_Data getError_data() {
		return error_data;
	}
	public void setError_data(Error_Data error_data) {
		this.error_data = error_data;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNew_beneficiary_id() {
		return new_beneficiary_id;
	}
	public void setNew_beneficiary_id(String new_beneficiary_id) {
		this.new_beneficiary_id = new_beneficiary_id;
	}
}
