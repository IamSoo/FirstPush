package com.soo.spring.integration.firstagain;

import org.springframework.integration.Message;

public class ChannelFilter {
	
	public boolean filter(Message message){
		String str = (String)message.getPayload();
		if(str != null){
			return true;
		}
		return false;
	}

}
