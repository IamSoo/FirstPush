package com.soo.spring.mocking;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

@InjectMocks
MathApplication mathApplication = new MathApplication();

@Mock
CalculatorService calcService;

@Test
public void testAdd(){
   //add the behavior of calc service to add two numbers
   //when(calcService.add(10.0,20.0)).thenReturn(30.00);

   //test the add functionality
  mathApplication.add(10.0, 20.0);
   verify(calcService,atLeast(1)).add(10.0,20.0);
   
   
}
	
}
