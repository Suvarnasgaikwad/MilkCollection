package com.MilkCollection.Model;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;
@Entity
public class Farmer 
{   @Id
	 @GeneratedValue(generator = "sequence-generator")
     @GenericGenerator(name = "sequence-generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
    parameters= {
		@Parameter(name = "sequence_name", value = "farm_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")		
})
    private int Id;
    
    @Column(name="FirstName")
	private String fname;
    @Column(name="LastName")
	private String lname;
    @Column(name="MobileNo")
	private long mobilenum;
    LocalDate date = LocalDate.now();
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Farmer [Id=" + Id + ", fname=" + fname + ", lname=" + lname + ", mobilenum=" + mobilenum + ", date="
				+ date + "]";
	}
	
	
}
