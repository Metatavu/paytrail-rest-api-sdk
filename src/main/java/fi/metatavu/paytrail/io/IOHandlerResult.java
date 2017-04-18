package fi.metatavu.paytrail.io;

public class IOHandlerResult {
  
  private String response;
  private int code;
	
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
}