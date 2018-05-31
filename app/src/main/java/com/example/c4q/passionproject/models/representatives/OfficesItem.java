package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfficesItem{

	@SerializedName("officialIndices")
	private List<Integer> officialIndices;

	@SerializedName("roles")
	private List<String> roles;

	@SerializedName("name")
	private String name;

	@SerializedName("divisionId")
	private String divisionId;

	@SerializedName("levels")
	private List<String> levels;

	public void setOfficialIndices(List<Integer> officialIndices){
		this.officialIndices = officialIndices;
	}

	public List<Integer> getOfficialIndices(){
		return officialIndices;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDivisionId(String divisionId){
		this.divisionId = divisionId;
	}

	public String getDivisionId(){
		return divisionId;
	}

	public void setLevels(List<String> levels){
		this.levels = levels;
	}

	public List<String> getLevels(){
		return levels;
	}

	@Override
 	public String toString(){
		return 
			"OfficesItem{" + 
			"officialIndices = '" + officialIndices + '\'' + 
			",roles = '" + roles + '\'' + 
			",name = '" + name + '\'' + 
			",divisionId = '" + divisionId + '\'' + 
			",levels = '" + levels + '\'' + 
			"}";
		}
}