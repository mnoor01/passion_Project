package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/5/18.
 */

public class Officials {
    private String name;
    private String[] address;
    private String party;
    private String[] phones;
    private String[] urls;
    private String photoUrl;
    private Channels[] channels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getUrls() {
        return urls;
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Channels[] getChannels() {
        return channels;
    }

    public void setChannels(Channels[] channels) {
        this.channels = channels;
    }

    public class Channels{
    String type;
    String id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
}
