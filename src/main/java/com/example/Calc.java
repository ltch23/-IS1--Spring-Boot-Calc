package com.example;

public class Calc {
	
	
	public float calculator(float num1,float num2, String op)
	{	
		switch (op)
		{
		case "add":
			 return add(num1,num2);
		case "subtract":
			 return subtact(num1,num2); 
		case "multiply":
			 return multiply(num1,num2);
		case "divide":
			 return divide(num1,num2);
		//add more operators;
		default:
			return xdefault(num1,num2);
		}
	}
	
	public float  add(float num1, float num2)
	{
	return num1+num2;
	}
	
	public float subtact(float num1, float num2)
	{
	return num1-num2;
	}
	
	public float multiply(float num1, float num2)
	{
	return num1*num2;
	}
	
	public float divide(float num1, float num2)
	{
		return num1/num2;
	}
	
	// add more methods
	public float xdefault(float num1, float num2)
	{
	return 0;
		
	}
	
}
