package com.MilkCollection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MilkCollection.Dao.FarmerDao;
import com.MilkCollection.Model.Farmer;


@Service
public class FarmerService implements FarmInterface {

	 @Autowired
    private FarmerDao data;
	 
	@Override
	public void createFarmer(Farmer farm) 
	{
		data.saveFarmer(farm);

	}

	@Override
	public List<Farmer> getFarmer() {
		List<Farmer>farm=data.loadFarmer();
		return farm;
	}

	@Override
	public  void delFarmer(Integer Id) 
	{
		data.delFarmer(Id);
		
		
	}

	@Override
	public Farmer getFarmer(int id) {
		Farmer farm=data.getFarmer(id);
		return farm;
		
	}

	@Override
	public void updateFarmer(Farmer farm) {
	data.updatefarm(farm);
		
	}

	

}
