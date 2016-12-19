package com.soo.spring.integration.firstagain;

import org.springframework.stereotype.Component;

@Component
public class InBoundChannelAdapter {

	public String insideAdapter(){
		return "Soonam Before entering to Channel";
	}
	
}
