package com.soo.spring.integration.firstagain;

import org.springframework.integration.annotation.Gateway;

public interface Responder {
	@Gateway(requestChannel="inputChannel")
	public String respond(String message);

}
