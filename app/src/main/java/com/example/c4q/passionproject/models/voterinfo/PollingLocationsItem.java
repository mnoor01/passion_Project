package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PollingLocationsItem{

	@SerializedName("address")
	private Address address;

	@SerializedName("notes")
	private String notes;

	@SerializedName("sources")
	private List<SourcesItem> sources;

	@SerializedName("pollingHours")
	private String pollingHours;

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}

	public String getNotes(){
		return notes;
	}

	public void setSources(List<SourcesItem> sources){
		this.sources = sources;
	}

	public List<SourcesItem> getSources(){
		return sources;
	}

	public void setPollingHours(String pollingHours){
		this.pollingHours = pollingHours;
	}

	public String getPollingHours(){
		return pollingHours;
	}

	@Override
 	public String toString(){
		return 
			"PollingLocationsItem{" + 
			"address = '" + address + '\'' + 
			",notes = '" + notes + '\'' + 
			",sources = '" + sources + '\'' + 
			",pollingHours = '" + pollingHours + '\'' + 
			"}";
		}
}