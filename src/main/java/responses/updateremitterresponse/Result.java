package responses.updateremitterresponse;

public class Result {
    private Remitter remitter;
    private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Remitter getRemitter() {
		return remitter;
	}

	public void setRemitter(Remitter remitter) {
		this.remitter = remitter;
	}
}
