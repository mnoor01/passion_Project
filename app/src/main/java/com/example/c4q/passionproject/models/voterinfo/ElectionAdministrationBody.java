package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

public class ElectionAdministrationBody{

	@SerializedName("votingLocationFinderUrl")
	private String votingLocationFinderUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("electionInfoUrl")
	private String electionInfoUrl;

	@SerializedName("correspondenceAddress")
	private CorrespondenceAddress correspondenceAddress;

	public void setVotingLocationFinderUrl(String votingLocationFinderUrl){
		this.votingLocationFinderUrl = votingLocationFinderUrl;
	}

	public String getVotingLocationFinderUrl(){
		return votingLocationFinderUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setElectionInfoUrl(String electionInfoUrl){
		this.electionInfoUrl = electionInfoUrl;
	}

	public String getElectionInfoUrl(){
		return electionInfoUrl;
	}

	public void setCorrespondenceAddress(CorrespondenceAddress correspondenceAddress){
		this.correspondenceAddress = correspondenceAddress;
	}

	public CorrespondenceAddress getCorrespondenceAddress(){
		return correspondenceAddress;
	}

	@Override
 	public String toString(){
		return 
			"ElectionAdministrationBody{" + 
			"votingLocationFinderUrl = '" + votingLocationFinderUrl + '\'' + 
			",name = '" + name + '\'' + 
			",electionInfoUrl = '" + electionInfoUrl + '\'' + 
			",correspondenceAddress = '" + correspondenceAddress + '\'' + 
			"}";
		}
}