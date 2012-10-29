package test.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InboundAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(InboundAdapter.class);
	public String initiateRequest() {
		LOGGER.debug("Inbound Adapter");
		return "From Inbound Adapter";
	}

}
