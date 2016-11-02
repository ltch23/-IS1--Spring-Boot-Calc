package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class CalcApplication
{

	 @RequestMapping("/")
	 @ResponseBody
	 String home()
	 {
	        return "Calcutator! ";
	 }
	
	public static void main(String[] args) 
	{
		SpringApplication.run(CalcApplication.class, args);
	}
}
