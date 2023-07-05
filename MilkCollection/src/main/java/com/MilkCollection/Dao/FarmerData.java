package com.MilkCollection.Dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	@Override
	public List<Farmer> loadFarmer() {
	//	List list=hibernateTemplate.find("select Id, date,fname, lname, mobilenum from Farmer");
		List list=hibernateTemplate.find("from Farmer");

		return list;
	}


	@Override
	public void delFarmer(Integer Id) {
		 Farmer farm=hibernateTemplate.get(Farmer.class, Id);
		 hibernateTemplate.delete(farm);
//		Session session= s.openSession();
//		Transaction tx=session.beginTransaction();
//		Query q = session.createQuery("delete from Farmer where id = :Id").setParameter("Id", Id);
//		int row=q.executeUpdate();
//		tx.commit();
//		session.close();
//		System.out.println("Rows are affected="+row+"");
		
	}

	
}
