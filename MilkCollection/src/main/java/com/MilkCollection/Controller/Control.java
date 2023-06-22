package com.MilkCollection.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Control 
{
	@RequestMapping(value="/reg.sp")
	public String user()
	{
		//String name=cust.getName();
		System.out.println("Show");
		return "Show";
		
	}
    
	
}
