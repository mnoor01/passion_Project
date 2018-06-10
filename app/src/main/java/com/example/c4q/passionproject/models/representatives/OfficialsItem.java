package com.example.c4q.passionproject.models.representatives;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import com.example.c4q.passionproject.database.Converter;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "repTable")
public class OfficialsItem {
    @PrimaryKey(autoGenerate = true)
    private long officialsDataId;

    public long getOfficialsDataId() {
        return officialsDataId;
    }

    public void setOfficialsDataId(long officialsDataId) {
        this.officialsDataId = officialsDataId;
    }

    private String photoUrl;

    private List<String> urls;

    private List<AddressItem> address;

    private List<ChannelsItem> channels;

    private String name;

    private List<String> phones;

    private String party;

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setAddress(List<AddressItem> address) {
        this.address = address;
    }

    public List<AddressItem> getAddress() {
        return address;
    }

    public void setChannels(List<ChannelsItem> channels) {
        this.channels = channels;
    }

    public List<ChannelsItem> getChannels() {
        return channels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getParty() {
        return party;
    }

    @Override
    public String toString() {
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