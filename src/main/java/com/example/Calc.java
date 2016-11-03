package com.example;


public class Calc {

	public float calculator(float num1,float num2,String op)
	{	
	switch (op)
	{
		 case "add":
			 op="+";
			 return add(num1, num2);
		 case "subtract":
			 op="-";
			 return substact(num1, num2); 
		 case "multiply":	 
			 op="*";
			 return multiply(num1,num2); 
		 case "divide":
			 op="/";
			 return divide(num1,num2);
		default:
			return xdefault(num1,num2);
	}
	
	}
	
	public float  add(float num1, float num2)
	{
	return num1+num2;
	}
	
	public float substact(float num1, float num2)
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
	
	public float xdefault(float num1, float num2)
	{
	return -1001;
		
	}
	
}
