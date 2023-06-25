package com.MilkCollection.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MilkCollection.Bean.Farmer;


@Controller
public class Control 
{

	@RequestMapping(value="/register.sp")
	public String user(@ModelAttribute Farmer farm )
	{
		String name=farm.getLname();
		System.out.println("Show"+name);
		return "Show";
	
		
	}
    
	
}
