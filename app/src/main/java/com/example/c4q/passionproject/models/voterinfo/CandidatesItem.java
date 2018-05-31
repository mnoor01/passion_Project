package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CandidatesItem{

	@SerializedName("channels")
	private List<ChannelsItem> channels;

	@SerializedName("name")
	private String name;

	@SerializedName("candidateUrl")
	private String candidateUrl;

	@SerializedName("party")
	private String party;

	public void setChannels(List<ChannelsItem> channels){
		this.channels = channels;
	}

	public List<ChannelsItem> getChannels(){
		return channels;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCandidateUrl(String candidateUrl){
		this.candidateUrl = candidateUrl;
	}

	public String getCandidateUrl(){
		return candidateUrl;
	}

	public void setParty(String party){
		this.party = party;
	}

	public String getParty(){
		return party;
	}

	@Override
 	public String toString(){
		return 
			"CandidatesItem{" + 
			"channels = '" + channels + '\'' + 
			",name = '" + name + '\'' + 
			",candidateUrl = '" + candidateUrl + '\'' + 
			",party = '" + party + '\'' + 
			"}";
		}
}