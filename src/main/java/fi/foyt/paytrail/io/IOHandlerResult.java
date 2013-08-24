package fi.foyt.paytrail.io;

public class IOHandlerResult {
	
	public IOHandlerResult(int code, String response) {
		this.response = response;
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public String getResponse() {
		return response;
	}
	
	private String response;
	private int code;
}