package com.soo.spring.integration.pollable.errorHandling;

public class Invitation {
	
	private final int number;

	public Invitation(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Invitation number " + number;
	}

}
