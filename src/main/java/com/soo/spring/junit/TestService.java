package com.soo.spring.junit;

import org.springframework.stereotype.Component;

@Component
public class TestService {

	public String getMyName(){
		return "Soonam";
	}
	public String getMyComanyName(){
		return "HSBC";
	}

}
