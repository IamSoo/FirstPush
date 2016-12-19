package com.soo.spring.integration.async.errorHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.task.TaskExecutor;

public class MessagePrinterExecutor {
	
private  TaskExecutor taskExecutor;
	
	public MessagePrinterExecutor(){
		
	}
	public MessagePrinterExecutor(TaskExecutor taskExecutor){
		this.taskExecutor = taskExecutor;
	}
	
	public List<String> createMessateList(){
		String [] array = {"soonam","kalyan","panda","living",null,"China"};
		return Arrays.asList(array);
	}
	
	
	public void printMessage(List<String> list){
		List<String> arrayList = createMessateList();
		for (int i = 0 ; i < 2 ; i ++) {
			try{
		 System.out.println("list is :" + list);
			//taskExecutor.execute(new MessagePrinterTask(list));
		 MessagePrinterTask pt= new MessagePrinterTask(list);
		 pt.printMessage();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
