package com.example.c4q.passionproject.models;

/**
 * Created by c4q on 5/6/18.
 */

public class PollingLocations {
    private Address address;
    private String notes;
    private String pollingHours;
    private String[] sources;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPollingHours() {
        return pollingHours;
    }

    public void setPollingHours(String pollingHours) {
        this.pollingHours = pollingHours;
    }

    public String[] getSources() {
        return sources;
    }

    public void setSources(String[] sources) {
        this.sources = sources;
    }

    public class Address{
      String locationName;
      String line1;
      String line2;
      String line3;
      String city;
      String state;
      String zip;

     public String getLocationName() {
         return locationName;
     }

     public void setLocationName(String locationName) {
         this.locationName = locationName;
     }

     public String getLine1() {
         return line1;
     }

     public void setLine1(String line1) {
         this.line1 = line1;
     }

     public String getLine2() {
         return line2;
     }

     public void setLine2(String line2) {
         this.line2 = line2;
     }

     public String getLine3() {
         return line3;
     }

     public void setLine3(String line3) {
         this.line3 = line3;
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
