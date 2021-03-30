package com.springboot.emp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(name="phoneNumber")
	private long phoneNumber;
	private String name;
	private String id;
	private String place;
	private String spamCount;
	
	
	public User() {
		super();
	}
	
		
	
	@Override
	public String toString() {
		return "User [phoneNumber=" + phoneNumber + ", name=" + name + ", id=" + id + ", place=" + place
				+ ", spamCount=" + spamCount + "]";
	}



	public User(long phoneNumber, String name, String id, String place, String spamCount) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.id = id;
		this.place = place;
		this.spamCount = spamCount;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSpamCount() {
		return spamCount;
	}
	public void setSpamCount(String spamCount) {
		this.spamCount = spamCount;
	}
	
}
