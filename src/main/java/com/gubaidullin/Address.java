package com.gubaidullin;


public class Address {
    private String country;
    private String city;
    private String postcode;

    public Address(String country, String city, String postcode) {
        this.country = country;
        this.city = city;
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
