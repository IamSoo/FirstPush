package com.soo.spring.integration.firstagain;

import org.springframework.stereotype.Component;

@Component
public class MyThread implements Runnable{
	
	String name;
	
	public  MyThread(String name){
		this.name = name;
	}
	public  MyThread(){
		
	}

	@Override
	public void run() {
		System.out.println("Thread " + name + " running.");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread " + name + " running 2.");
	}

}
