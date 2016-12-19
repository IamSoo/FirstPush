package com.soo.spring.integration.pollable.errorHandling;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;


public class PartyHost {
	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PartyHost.class);
	private final AtomicInteger counter = new AtomicInteger(0);

	public Invitation nextInvitation() {
		System.out.println("Inside next invitation : +" + counter);
		return new Invitation(counter.incrementAndGet());
	}

	public void onInvitationFailed(Invitation inv) {
		System.out.println("Host received failure notification for: " + inv);
	}

}
