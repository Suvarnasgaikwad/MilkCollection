package com.MilkCollection.Service;

import java.util.List;

import com.MilkCollection.Model.Farmer;
public interface FarmInterface 
{
	public void createFarmer(Farmer farm);
	public 	List<Farmer> getFarmer();
	public void delFarmer(Integer Id);
	public Farmer getFarmer(int id);
	public void updateFarmer(Farmer farm);
	
}
