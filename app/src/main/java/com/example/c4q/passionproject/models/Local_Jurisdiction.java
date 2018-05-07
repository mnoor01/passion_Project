package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/6/18.
 */

public class Local_Jurisdiction {
    private String name;
    private ElectionAdministrationBody electionAdministrationBody;
    private Sources sources;

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ElectionAdministrationBody getElectionAdministrationBody() {
        return electionAdministrationBody;
    }

    public void setElectionAdministrationBody(ElectionAdministrationBody electionAdministrationBody) {
        this.electionAdministrationBody = electionAdministrationBody;
    }



        public class CorrespondenceAddress{
            private String line1;
            private String city;
            private String state;
            private String zip;

            public String getLine1() {
                return line1;
            }

            public void setLine1(String line1) {
                this.line1 = line1;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getZip() {
                return zip;
            }

            public void setZip(String zip) {
                this.zip = zip;
            }
        }
    }

