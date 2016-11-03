package com.example;
//import com.example.Calc;


public class Error {

		
	public boolean isNumber(String num)
	{
		try {
		Float.parseFloat(num);}
		catch(Exception e)
		{
		return false;	
		}
	return true;
	}

	public boolean isOperator(String op)
	{
		switch (op)
		{
		case "add":
			 return true;
		case "subtract":
			 return true;
		case "multiply":
			 return true;
		case "divide":
			 return true;
		//add more operators;
		default:
			return false;
		}
	}
	
	public boolean validate(float num)
	{
		if (num==Float.POSITIVE_INFINITY || num==Float.NEGATIVE_INFINITY)
			return false;
		else
		return true;
		
	}
}
