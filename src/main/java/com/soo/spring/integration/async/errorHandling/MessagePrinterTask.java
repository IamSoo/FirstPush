package com.soo.spring.integration.async.errorHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.core.task.TaskExecutor;

public class MessagePrinterTask implements Runnable{
	
	private List<String> list = new ArrayList<String>();

	private String message;
	
	public MessagePrinterTask(List<String> list){
		this.list = list;
	}
	
	public void run (){
		Iterator<String> it = this.list.iterator();
		while(it.hasNext()){
			try{
			System.out.println(Thread.currentThread().getName()+" :"+it.next().toString());
			}catch(Exception e){
				System.out.println("Caught exception");
				e.printStackTrace();
				
			}
		}
		
	}
	
	public void printMessage (){
		Iterator<String> it = this.list.iterator();
		while(it.hasNext()){
			try{
			System.out.println(Thread.currentThread().getName()+" :"+it.next().toString());
			}catch(Exception e){
				System.out.println("Caught exception");
				e.printStackTrace();
				
			}
		}
		
	}
	
	

}
