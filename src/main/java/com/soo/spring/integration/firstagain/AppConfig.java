package com.soo.spring.integration.firstagain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class AppConfig {
	
	public static void main(String [] args){
		System.out.println(String.format("%06d", 10));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config3.xml");
		ThreadPoolTaskExecutor ext = (ThreadPoolTaskExecutor)context.getBean("taskExecutor");
		
		ext.execute(new MyThread("T1"));
		ext.execute(new MyThread("T2"));
		ext.execute(new MyThread("T3"));
		
		for(;;){
			int count= ext.getActiveCount();
			System.out.println("Active threads :" + count);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(count == 0 ){
				ext.shutdown();
				break;
			}
			
		}

	}

}
