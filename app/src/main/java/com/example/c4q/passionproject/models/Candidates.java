package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/6/18.
 */

public class Candidates {
    private String name;
    private String party;
    private String candidateUrl;
    private Channels[] channels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getCandidateUrl() {
        return candidateUrl;
    }

    public void setCandidateUrl(String candidateUrl) {
        this.candidateUrl = candidateUrl;
    }

    public Channels[] getChannels() {
        return channels;
    }

    public void setChannels(Channels[] channels) {
        this.channels = channels;
    }
}
