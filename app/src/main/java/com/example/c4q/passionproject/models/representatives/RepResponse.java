package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RepResponse{

	@SerializedName("kind")
	private String kind;

	@SerializedName("normalizedInput")
	private NormalizedInput normalizedInput;

	@SerializedName("offices")
	private List<OfficesItem> offices;

	@SerializedName("officials")
	private List<OfficialsItem> officials;

	@SerializedName("divisions")
	private Divisions divisions;

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

	public void setOffices(List<OfficesItem> offices){
		this.offices = offices;
	}

	public List<OfficesItem> getOffices(){
		return offices;
	}

	public void setOfficials(List<OfficialsItem> officials){
		this.officials = officials;
	}

	public List<OfficialsItem> getOfficials(){
		return officials;
	}

	public void setDivisions(Divisions divisions){
		this.divisions = divisions;
	}

	public Divisions getDivisions(){
		return divisions;
	}

	@Override
 	public String toString(){
		return 
			"RepResponse{" + 
			"kind = '" + kind + '\'' + 
			",normalizedInput = '" + normalizedInput + '\'' + 
			",offices = '" + offices + '\'' + 
			",officials = '" + officials + '\'' + 
			",divisions = '" + divisions + '\'' + 
			"}";
		}
}