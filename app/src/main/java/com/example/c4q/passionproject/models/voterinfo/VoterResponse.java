package com.example.c4q.passionproject.models.voterinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VoterResponse {

	@SerializedName("contests")
	private List<ContestsItem> contests;

	@SerializedName("election")
	private Election election;

	@SerializedName("kind")
	private String kind;

	@SerializedName("normalizedInput")
	private NormalizedInput normalizedInput;

	@SerializedName("pollingLocations")
	private List<PollingLocationsItem> pollingLocations;

	@SerializedName("state")
	private List<StateItem> state;

	public void setContests(List<ContestsItem> contests){
		this.contests = contests;
	}

	public List<ContestsItem> getContests(){
		return contests;
	}

	public void setElection(Election election){
		this.election = election;
	}

	public Election getElection(){
		return election;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setNormalizedInput(NormalizedInput normalizedInput){
		this.normalizedInput = normalizedInput;
	}

	public NormalizedInput getNormalizedInput(){
		return normalizedInput;
	}

	public void setPollingLocations(List<PollingLocationsItem> pollingLocations){
		this.pollingLocations = pollingLocations;
	}

	public List<PollingLocationsItem> getPollingLocations(){
		return pollingLocations;
	}

	public void setState(List<StateItem> state){
		this.state = state;
	}

	public List<StateItem> getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"VoterResponse{" +
			"contests = '" + contests + '\'' + 
			",election = '" + election + '\'' + 
			",kind = '" + kind + '\'' + 
			",normalizedInput = '" + normalizedInput + '\'' + 
			",pollingLocations = '" + pollingLocations + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}