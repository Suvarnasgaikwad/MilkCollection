package com.MilkCollection.Service;

import java.util.List;

import com.MilkCollection.Model.Farmer;
public interface FarmInterface 
{
	public void createFarmer(Farmer farm);
	public 	List<Farmer> getFarmer();
	
}
