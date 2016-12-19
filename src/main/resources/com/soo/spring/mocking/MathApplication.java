package com.soo.spring.mocking;

public class MathApplication implements CalculatorService{
	
	private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   
	   public double add(double input1, double input2){
	      return calcService.add(input1, input2);
	   }
	   
	   public double subtract(double input1, double input2){
	      return calcService.subtract(input1, input2);
	   }
}
