package com.soo.spring.integration.async.errorHandling;

import java.util.List;

public interface ErrorHandlingGateway {
	
	public void sendMessge(List<String> messages);

}
