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

//    @TypeConverter
//    public String fromAddressRepToString(List<AddressItem> officialsItems) {
//        Gson gson = new Gson();
//        return gson.toJson(officialsItems);
//    }
//
//    @TypeConverter
//    public List<AddressItem> fromStringToRepAddress(String addressItem) {
//        Type type = new TypeToken<List<AddressItem>>() {}.getType();
//
//        return new Gson().fromJson(addressItem,type);
//    }
//    @TypeConverter
//    public String fromChannelListToString(List<ChannelsItem> channelsItems){
//        Gson gson= new Gson();
//        return gson.toJson(channelsItems);
//    }
//    @TypeConverter
//    public List<ChannelsItem> fromStringToChannel(String channels){
//        Type type=new TypeToken<List<ChannelsItem>>(){}.getType();
//        return new Gson().fromJson(channels,type);
//    }
//    @TypeConverter
//    public String fromPhoneToString(List<String> phoneNumbers){
//        Gson gson=new Gson();
//        return gson.toJson(phoneNumbers);
//    }
//    @TypeConverter
//    public List<String> fromStringToPhone(String phone){
//        Type type= new TypeToken<List<String>>(){}.getType();
//        return new Gson().fromJson(phone,type);
//    }




}