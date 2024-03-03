package com.springbasics.autowire;

public class Address {

    private String City;
    private String Street;
    private int Pincode;
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public int getPincode() {
        return Pincode;
    }
    public void setPincode(int pincode) {
        Pincode = pincode;
    }
    public Address(String city, String street, int pincode) {
        City = city;
        Street = street;
        Pincode = pincode;
    }
    
    public Address() {
        super();
    }
    @Override
    public String toString() {
        return "Address [City=" + City + ", Street=" + Street + ", Pincode=" + Pincode + "]";
    }

        
}
