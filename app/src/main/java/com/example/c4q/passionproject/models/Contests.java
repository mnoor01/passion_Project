package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/6/18.
 */

public class Contests {
    private String type;
    private String office;
    private String[] level;
    private String[] roles;
    private District district;
    private Candidates[] candidates;
    private Sources sources;

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String[] getLevel() {
        return level;
    }

    public void setLevel(String[] level) {
        this.level = level;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Candidates[] getCandidates() {
        return candidates;
    }

    public void setCandidates(Candidates[] candidates) {
        this.candidates = candidates;
    }

    private class District {
        private String name;
        private String scope;
        private String id;
        private String kgForeignKey;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getKgForeignKey() {
            return kgForeignKey;
        }

        public void setKgForeignKey(String kgForeignKey) {
            this.kgForeignKey = kgForeignKey;
        }
    }
}
