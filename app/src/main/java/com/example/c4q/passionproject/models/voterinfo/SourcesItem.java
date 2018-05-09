package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

public class SourcesItem{

	@SerializedName("name")
	private String name;

	@SerializedName("official")
	private boolean official;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOfficial(boolean official){
		this.official = official;
	}

	public boolean isOfficial(){
		return official;
	}

	@Override
 	public String toString(){
		return 
			"SourcesItem{" + 
			"name = '" + name + '\'' + 
			",official = '" + official + '\'' + 
			"}";
		}
}