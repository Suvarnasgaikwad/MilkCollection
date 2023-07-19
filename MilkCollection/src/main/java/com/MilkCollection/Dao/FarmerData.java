package com.MilkCollection.Dao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.MilkCollection.Model.Farmer;

@Transactional
@Repository
public class FarmerData implements FarmerDao {
	
	@Autowired
     private HibernateTemplate hibernateTemplate;
	@Override
	public void saveFarmer(Farmer farm) {
		
		hibernateTemplate.saveOrUpdate(farm);
	}
	
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	@Override
	public List<Farmer> loadFarmer() 
	{
		List list=hibernateTemplate.find("from Farmer");
		return list;
	}


	@Override
	public void delFarmer(Integer Id) {
		 Farmer farm=hibernateTemplate.get(Farmer.class, Id);
		 hibernateTemplate.delete(farm);
		
	}

	@Override
	public Farmer getFarmer(int id) 
	{
		Farmer farm=hibernateTemplate.get(Farmer.class,id);
		return farm;
		
	}

	@Override
	public void updatefarm(Farmer farm) 
	{
		 hibernateTemplate.update(farm);
		
	}

	
}
