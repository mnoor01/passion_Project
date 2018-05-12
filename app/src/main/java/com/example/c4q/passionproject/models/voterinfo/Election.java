package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

public class Election{

	@SerializedName("ocdDivisionId")
	private String ocdDivisionId;

	@SerializedName("name")
	private String name;

	@SerializedName("electionDay")
	private String electionDay;

	@SerializedName("id")
	private String id;

	public void setOcdDivisionId(String ocdDivisionId){
		this.ocdDivisionId = ocdDivisionId;
	}

	public String getOcdDivisionId(){
		return ocdDivisionId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setElectionDay(String electionDay){
		this.electionDay = electionDay;
	}

	public String getElectionDay(){
		return electionDay;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Election{" + 
			"ocdDivisionId = '" + ocdDivisionId + '\'' + 
			",name = '" + name + '\'' + 
			",electionDay = '" + electionDay + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}