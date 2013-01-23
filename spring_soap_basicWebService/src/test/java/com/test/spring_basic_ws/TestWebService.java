package com.test.spring_basic_ws;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:testwebservice.xml"})

public class TestWebService {

    @Autowired
    private ApplicationContext applicationContext;                                           
    private MockWebServiceClient mockClient;

    @Before
    public void createClient() {
      mockClient = MockWebServiceClient.createClient(applicationContext);                  
    }

    @Test 
    public void TemperatureMarshallingEndpoint() throws Exception {
    	Source requestPayload = new StreamSource(placeOrderRequest);
    	Source responsePayload = new StreamSource(placeOrderResponse);
    	mockClient.sendRequest(withPayload(requestPayload)).
    	andExpect(payload(responsePayload));

    }
} 