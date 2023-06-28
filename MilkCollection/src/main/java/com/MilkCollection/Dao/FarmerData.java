package com.MilkCollection.Dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.MilkCollection.Model.Farmer;


@Transactional
@Repository
public class FarmerData implements FarmerDao {

	@Autowired
	private SessionFactory s;
	
	@Autowired
     private HibernateTemplate hibernateTemplate;
	@Override
	public void saveFarmer(Farmer farm) {
		
		hibernateTemplate.saveOrUpdate(farm);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<Farmer> loadFarmer() {
//		List list=hibernateTemplate.find("select Id, fname, lname, mobilenum from Farmer");
		List list=hibernateTemplate.find("from Farmer");
//		List<Farmer>farm=new ArrayList<Farmer>();
//		for(int i=0;i<list.size();i++)
//		{
//			Farmer c=new Farmer();
//			Object[]obj=(Object[]) list.get(i);
//			int id=(Integer) obj[0];
//			c.setId(id);
//			String name=(String) obj[1];
//			c.setFname(name);
//			String lname= (String) obj[2];
//		    c.setLname(lname);
//			Long num=(Long) obj[3];
//			c.setMobilenum(num);
//			farm.add(c);
//			
//		}
		return list;
	}

	
}
