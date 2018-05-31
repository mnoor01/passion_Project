package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LocalJurisdiction{

	@SerializedName("electionAdministrationBody")
	private ElectionAdministrationBody electionAdministrationBody;

	@SerializedName("sources")
	private List<SourcesItem> sources;

	@SerializedName("name")
	private String name;

	public void setElectionAdministrationBody(ElectionAdministrationBody electionAdministrationBody){
		this.electionAdministrationBody = electionAdministrationBody;
	}

	public ElectionAdministrationBody getElectionAdministrationBody(){
		return electionAdministrationBody;
	}

	public void setSources(List<SourcesItem> sources){
		this.sources = sources;
	}

	public List<SourcesItem> getSources(){
		return sources;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"LocalJurisdiction{" + 
			"electionAdministrationBody = '" + electionAdministrationBody + '\'' + 
			",sources = '" + sources + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}