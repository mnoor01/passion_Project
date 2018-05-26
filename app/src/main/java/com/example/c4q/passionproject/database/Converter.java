package com.example.c4q.passionproject.database;

import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import com.example.c4q.passionproject.models.representatives.AddressItem;
import com.example.c4q.passionproject.models.representatives.OfficialsItem;
import com.example.c4q.passionproject.models.voterinfo.Address;
import com.example.c4q.passionproject.models.voterinfo.ChannelsItem;
import com.example.c4q.passionproject.models.voterinfo.SourcesItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Converter {
    @TypeConverter
    public String fromAddressToString(Address address) {
        Gson gson = new Gson();
        return gson.toJson(address);
    }

    @TypeConverter
    public Address fromStringToAddress(String address) {
        Type type = new TypeToken<Address>() {
        }.getType();

        return new Gson().fromJson(address, type);
    }

    @TypeConverter
    public String fromSourcesToString(List<SourcesItem> sources) {
        Gson gson = new Gson();
        return gson.toJson(sources);
    }

    @TypeConverter
    public List<SourcesItem> fromStringToSources(String sources) {
        Type type = new TypeToken<List<SourcesItem>>() {
        }.getType();

        return new Gson().fromJson(sources, type);
    }

    @TypeConverter
    public String fromAddressRepToString(List<AddressItem> officialsItems) {
        Gson gson = new Gson();
        return gson.toJson(officialsItems);
    }

    @TypeConverter
    public List<AddressItem> fromStringToRepAddress(String addressItem) {
        Type type = new TypeToken<List<AddressItem>>() {
        }.getType();

        return new Gson().fromJson(addressItem, type);
    }
    @TypeConverter
    public String fromChannelToString(ChannelsItem channelsItem){
        if (channelsItem==null){
            return null;
        }
        Gson gson= new Gson();
        Type type= new TypeToken<ChannelsItem>(){}.getType();
        String json=gson.toJson(channelsItem,type);
        return json;
    }
    @TypeConverter
    public ChannelsItem fromStringToChannelSolo(String channelString){
        if (channelString== null){
            return null;

        }
        Type type= new TypeToken<ChannelsItem>(){}.getType();
        Gson gson= new Gson();

        ChannelsItem channelsItem=gson.fromJson(channelString,type);
        return channelsItem;

    }

    @TypeConverter
    public String fromChannelListToString(List<ChannelsItem> channelsItems) {
        if (channelsItems==null){
            return null;
        }
        Gson gson = new Gson();
        Type type= new TypeToken<List<ChannelsItem>>(){}.getType();
        String json=gson.toJson(channelsItems,type);
        return json;
    }

    @TypeConverter
    public List<ChannelsItem> fromStringToChannel(String channels) {
        if (channels==null){
            return null;
        }
        Type type = new TypeToken<List<ChannelsItem>>() {
        }.getType();
        Gson gson= new Gson();
        List<ChannelsItem> channelsItems=gson.fromJson(channels,type);
        return channelsItems;
    }


    @TypeConverter
    public String fromPhoneToString(List<String> phoneNumbers) {
        Gson gson = new Gson();
        return gson.toJson(phoneNumbers);
    }

    @TypeConverter
    public List<String> fromStringToPhone(String phone) {
        Type type = new TypeToken<List<String>>() {
        }.getType();
        return new Gson().fromJson(phone, type);
    }
}