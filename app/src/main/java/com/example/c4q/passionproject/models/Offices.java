package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/5/18.
 */

public class Offices {
    private String name;
    private String divisionId;
    private String[] levels;
    private String[] roles;
    private int[] officialIndices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String[] getLevels() {
        return levels;
    }

    public void setLevels(String[] levels) {
        this.levels = levels;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public int[] getOfficialIndices() {
        return officialIndices;
    }

    public void setOfficialIndices(int[] officialIndices) {
        this.officialIndices = officialIndices;
    }
}
