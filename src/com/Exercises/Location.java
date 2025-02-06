package com.Exercises;

public class Location {
    String Country;
    String City;
    int postcode;

    public Location(String country, String city, int postcode) {
        Country = country;
        City = city;
        this.postcode = postcode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}
