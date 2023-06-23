package responses.updatebeneficiaryresponse;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	 private String responseId;
     private String status;
	 private Result result;
	 
	 
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
		public Result getResult() {
			return result;
		}
		public void setResult(Result result) {
			this.result = result;
		}
}
