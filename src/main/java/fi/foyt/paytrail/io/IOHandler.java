package fi.foyt.paytrail.io;

import java.io.IOException;

public interface IOHandler {

	public IOHandlerResult doPost(String merchantId, String merchantSecret, String url, String data) throws IOException;
	
}
