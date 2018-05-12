package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

public class AddressItem{

	@SerializedName("zip")
	private String zip;

	@SerializedName("city")
	private String city;

	@SerializedName("state")
	private String state;

	@SerializedName("line2")
	private String line2;

	@SerializedName("line1")
	private String line1;

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setLine2(String line2){
		this.line2 = line2;
	}

	public String getLine2(){
		return line2;
	}

	public void setLine1(String line1){
		this.line1 = line1;
	}

	public String getLine1(){
		return line1;
	}

	@Override
 	public String toString(){
		return 
			"AddressItem{" + 
			"zip = '" + zip + '\'' + 
			",city = '" + city + '\'' + 
			",state = '" + state + '\'' + 
			",line2 = '" + line2 + '\'' + 
			",line1 = '" + line1 + '\'' + 
			"}";
		}
}