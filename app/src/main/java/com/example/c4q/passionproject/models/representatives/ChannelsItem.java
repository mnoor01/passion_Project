package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

public class ChannelsItem{

	@SerializedName("id")
	private String id;

	@SerializedName("type")
	private String type;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
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
			"ChannelsItem{" + 
			"id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}