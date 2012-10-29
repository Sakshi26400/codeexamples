package test.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.Message;

public class HttpResponsePersisterService {
	private static final Logger LOGGER = LoggerFactory.getLogger(HttpResponsePersisterService.class);

	public void persistResponse(Message<String> message){
		LOGGER.debug("\n##################Transformed message ########################\n"+message.getPayload());
	}
}
