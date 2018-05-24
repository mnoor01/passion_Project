package com.example.c4q.passionproject.models.elections;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "electionTable")
public class ElectionsItem {
    @PrimaryKey(autoGenerate = true)
    private long datId;

    public long getDatId() {
        return datId;
    }

    public void setDatId(long datId) {
        this.datId = datId;
    }

    @SerializedName("ocdDivisionId")
    private String ocdDivisionId;

    @SerializedName("name")
    private String name;

    @SerializedName("electionDay")
    private String electionDay;

    @SerializedName("id")
    private String id;

    public void setOcdDivisionId(String ocdDivisionId) {
        this.ocdDivisionId = ocdDivisionId;
    }

    public String getOcdDivisionId() {
        return ocdDivisionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setElectionDay(String electionDay) {
        this.electionDay = electionDay;
    }

    public String getElectionDay() {
        return electionDay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "ElectionsItem{" +
                        "ocdDivisionId = '" + ocdDivisionId + '\'' +
                        ",name = '" + name + '\'' +
                        ",electionDay = '" + electionDay + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}