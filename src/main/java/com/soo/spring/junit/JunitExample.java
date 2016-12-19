package com.soo.spring.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class JunitExample {
	
	@Autowired
	private TestService testService;
	
	
	@Test
	public void testName(){
		assertEquals("Soonam",testService.getMyName());
	}
	
	@Test
	public void testCompanyName(){
		assertEquals("Oracle",testService.getMyComanyName());
	}
	

}
