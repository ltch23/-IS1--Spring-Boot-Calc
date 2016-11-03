package com.example;
import com.example.Calc;
import com.example.Error;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class CalcApplication
{
	Calc calc= new Calc();
	Error error=new Error();
	
	 @RequestMapping("/")
	 @ResponseBody
	 String home()
	 {
	        return "Calcutator! ";
	 }
	
	 @RequestMapping("/calc")
	 @ResponseBody
	 String calc(@RequestParam String n1,@RequestParam String n2, @RequestParam String op)
	 {
	 	 if (error.isNumber(n1)==false) return "Error  n1= "+ n1 + " es invalido";
	 	 else if (error.isNumber(n2)==false) return "Error  n2= "+ n2 + " es invalido";
	 	 else if(error.isOperator(op)==false) return "Error  op= "+ op + " es invalido";
	 	 
	 	 float num1,num2,rpta;
	 	 rpta=0;
	 	 num1=Float.parseFloat(n1);
		 num2=Float.parseFloat(n2);
		 
		 rpta=calc.calculator(num1,num2,op);
		 if(error.validate(rpta)==false) return "Error  operacion  invalida ";
	 	 
		 return n1+"  " +op+ " " +n2+ " = "+Float.toString(rpta);
	 	 
	 }
	 
	public static void main(String[] args) 
	{
		SpringApplication.run(CalcApplication.class, args);
	}
}
