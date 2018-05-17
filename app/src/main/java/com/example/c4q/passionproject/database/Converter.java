package com.example.c4q.passionproject.database;

import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import com.example.c4q.passionproject.models.voterinfo.Address;
import com.example.c4q.passionproject.models.voterinfo.SourcesItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.converter.gson.GsonConverterFactory;


public class Converter {
    @TypeConverter
    public String fromAddressToString(Address address) {
        Gson gson= new Gson();
        return gson.toJson(address);
    }
    @TypeConverter
    public Address fromStringToAddress(String address){
        Type type= new TypeToken<Address>(){}.getType();

        return new Gson().fromJson(address,type);
    }
    @TypeConverter
    public String fromSourcesToString(List<SourcesItem> sources) {
        Gson gson= new Gson();
        return gson.toJson(sources);
    }
    @TypeConverter
    public List<SourcesItem> fromStringToSources(String sources){
        Type type= new TypeToken<List<SourcesItem>>(){}.getType();

        return new Gson().fromJson(sources,type);
    }


}