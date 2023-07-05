package com.MilkCollection.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.MilkCollection.Model.Farmer;
import com.MilkCollection.Service.FarmInterface;
@Component
@Controller
public class Control 
{
	@Autowired
	private FarmInterface service; 
	

	@RequestMapping(value="/register.sp",method=RequestMethod.POST)
	public String user(@ModelAttribute Farmer farm ,Model model)
	{    
		
		service.createFarmer(farm);
        model.addAttribute("msg",farm.getFname());
		return "Show";		
	}
	@RequestMapping(value="/list.sp")
	public String user(ModelMap model)
	{    
		List<Farmer>farm=service.getFarmer();
		model.addAttribute(farm);
		
		 model.put("msg",farm);

		return "list";
	}
	
	@RequestMapping("/delete.sp/{id}")
	public String del(@PathVariable ("id") int id,Model model)
	  {
		service.delFarmer(id);
		model.addAttribute("msg1", "Success");	
		return "list";
	  }

}
