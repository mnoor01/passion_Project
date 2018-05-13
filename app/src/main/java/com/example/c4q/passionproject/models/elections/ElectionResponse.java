package com.example.c4q.passionproject.models.elections;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ElectionResponse{

	private String kind;

	private List<ElectionsItem> elections;

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setElections(List<ElectionsItem> elections){
		this.elections = elections;
	}

	public List<ElectionsItem> getElections(){
		return elections;
	}

	@Override
 	public String toString(){
		return 
			"ElectionResponse{" + 
			"kind = '" + kind + '\'' + 
			",elections = '" + elections + '\'' + 
			"}";
		}
}