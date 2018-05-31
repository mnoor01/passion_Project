package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContestsItem{

	@SerializedName("candidates")
	private List<CandidatesItem> candidates;

	@SerializedName("sources")
	private List<SourcesItem> sources;

	@SerializedName("level")
	private List<String> level;

	@SerializedName("roles")
	private List<String> roles;

	@SerializedName("district")
	private District district;

	@SerializedName("office")
	private String office;

	@SerializedName("type")
	private String type;

	public void setCandidates(List<CandidatesItem> candidates){
		this.candidates = candidates;
	}

	public List<CandidatesItem> getCandidates(){
		return candidates;
	}

	public void setSources(List<SourcesItem> sources){
		this.sources = sources;
	}

	public List<SourcesItem> getSources(){
		return sources;
	}

	public void setLevel(List<String> level){
		this.level = level;
	}

	public List<String> getLevel(){
		return level;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

	public void setDistrict(District district){
		this.district = district;
	}

	public District getDistrict(){
		return district;
	}

	public void setOffice(String office){
		this.office = office;
	}

	public String getOffice(){
		return office;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"ContestsItem{" + 
			"candidates = '" + candidates + '\'' + 
			",sources = '" + sources + '\'' + 
			",level = '" + level + '\'' + 
			",roles = '" + roles + '\'' + 
			",district = '" + district + '\'' + 
			",office = '" + office + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}