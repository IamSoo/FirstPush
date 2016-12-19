package com.soo.spring.integration.pollable.errorHandling;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
public class PartyGuest {

private Logger logger = Logger.getLogger(PartyGuest.class);
	
	public void onInvitation(Invitation invitation) {
		System.out.println("Guest is throwing exception");
		throw new RuntimeException("Wrong address");
	}
}
