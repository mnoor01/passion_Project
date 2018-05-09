package com.example.c4q.passionproject.models.representatives;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfficialsItem{

	@SerializedName("photoUrl")
	private String photoUrl;

	@SerializedName("urls")
	private List<String> urls;

	@SerializedName("address")
	private List<AddressItem> address;

	@SerializedName("channels")
	private List<ChannelsItem> channels;

	@SerializedName("name")
	private String name;

	@SerializedName("phones")
	private List<String> phones;

	@SerializedName("party")
	private String party;

	public void setPhotoUrl(String photoUrl){
		this.photoUrl = photoUrl;
	}

	public String getPhotoUrl(){
		return photoUrl;
	}

	public void setUrls(List<String> urls){
		this.urls = urls;
	}

	public List<String> getUrls(){
		return urls;
	}

	public void setAddress(List<AddressItem> address){
		this.address = address;
	}

	public List<AddressItem> getAddress(){
		return address;
	}

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

	public void setPhones(List<String> phones){
		this.phones = phones;
	}

	public List<String> getPhones(){
		return phones;
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
			"OfficialsItem{" + 
			"photoUrl = '" + photoUrl + '\'' + 
			",urls = '" + urls + '\'' + 
			",address = '" + address + '\'' + 
			",channels = '" + channels + '\'' + 
			",name = '" + name + '\'' + 
			",phones = '" + phones + '\'' + 
			",party = '" + party + '\'' + 
			"}";
		}
}