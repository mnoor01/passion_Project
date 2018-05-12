package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OcdDivisionCountryUsStateKsCd3{

	@SerializedName("name")
	private String name;

	@SerializedName("officeIndices")
	private List<Integer> officeIndices;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOfficeIndices(List<Integer> officeIndices){
		this.officeIndices = officeIndices;
	}

	public List<Integer> getOfficeIndices(){
		return officeIndices;
	}

	@Override
 	public String toString(){
		return 
			"OcdDivisionCountryUsStateKsCd3{" + 
			"name = '" + name + '\'' + 
			",officeIndices = '" + officeIndices + '\'' + 
			"}";
		}
}