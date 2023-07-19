package com.MilkCollection.Dao;

import java.util.List;

import com.MilkCollection.Model.Farmer;
public interface FarmerDao 
{
	  public void saveFarmer(Farmer farm);
	  public List<Farmer> loadFarmer();
	  public void delFarmer(Integer Id);
	  public Farmer getFarmer(int id);
	  public void updatefarm(Farmer farm);

}
