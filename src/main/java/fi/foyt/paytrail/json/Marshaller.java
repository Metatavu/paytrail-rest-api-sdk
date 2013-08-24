package fi.foyt.paytrail.json;

import java.io.IOException;

public interface Marshaller {

	public String objectToString(Object object) throws IOException;
	
	public <T> T stringToObject(Class<? extends T> clazz, String string) throws IOException;
	
}
