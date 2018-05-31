package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

public class ElectionOfficialsItem{

	@SerializedName("officePhoneNumber")
	private String officePhoneNumber;

	@SerializedName("emailAddress")
	private String emailAddress;

	@SerializedName("name")
	private String name;

	@SerializedName("title")
	private String title;

	public void setOfficePhoneNumber(String officePhoneNumber){
		this.officePhoneNumber = officePhoneNumber;
	}

	public String getOfficePhoneNumber(){
		return officePhoneNumber;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"ElectionOfficialsItem{" + 
			"officePhoneNumber = '" + officePhoneNumber + '\'' + 
			",emailAddress = '" + emailAddress + '\'' + 
			",name = '" + name + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}