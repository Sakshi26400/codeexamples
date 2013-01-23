package com.test.spring_soap_ws;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
@Endpoint
public class TestEndPoint {

	  private static final String NAMESPACE_URI = "http://chandan/qb/schemas";

	  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TestRequest")
	  @ResponsePayload
	  public Element handleTestRequest(@RequestPayload Element testRequest)               
	      throws Exception {
		  	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder docBuilder = factory.newDocumentBuilder();
		    Document doc = docBuilder.newDocument();
		    Element codes = doc.createElement("HelloMessage");
		    return codes;
	  }

}
