package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

public class OcdDivisionCountryUsStateKsCountyWyandotte{

	@SerializedName("name")
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"OcdDivisionCountryUsStateKsCountyWyandotte{" + 
			"name = '" + name + '\'' + 
			"}";
		}
}