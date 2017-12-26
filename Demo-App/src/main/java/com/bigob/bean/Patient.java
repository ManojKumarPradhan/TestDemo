package com.bigob.bean;

import com.google.gson.Gson;

public class Patient {

	private int id;
	private String fName;
	private String lName;
	private String createdDate;
	
	public int getId() {
		return id;
	}
	public Patient setId(int id) {
		this.id = id;
		return this;
	}
	public String getfName() {
		return fName;
	}
	public Patient setfName(String fName) {
		this.fName = fName;
		return this;
	}
	public String getlName() {
		return lName;
	}
	public Patient setlName(String lName) {
		this.lName = lName;
		return this;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public Patient setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
		return this;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
