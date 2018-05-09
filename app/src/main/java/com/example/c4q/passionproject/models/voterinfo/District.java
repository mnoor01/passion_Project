package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

public class District{

	@SerializedName("scope")
	private String scope;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("kgForeignKey")
	private String kgForeignKey;

	public void setScope(String scope){
		this.scope = scope;
	}

	public String getScope(){
		return scope;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setKgForeignKey(String kgForeignKey){
		this.kgForeignKey = kgForeignKey;
	}

	public String getKgForeignKey(){
		return kgForeignKey;
	}

	@Override
 	public String toString(){
		return 
			"District{" + 
			"scope = '" + scope + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",kgForeignKey = '" + kgForeignKey + '\'' + 
			"}";
		}
}