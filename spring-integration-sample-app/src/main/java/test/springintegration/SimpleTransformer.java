package test.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.Message;

public class SimpleTransformer {
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTransformer.class);
	public String transformMessage(Message<String> message){
		LOGGER.debug("Message Payload"+message.getPayload());
		return "\n##################Modified Payload ##############\n"+message.getPayload();
	}
}
