package models;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String userName;
    @SerializedName("email")
    private String email;
    @SerializedName("address")
    private Address address;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;
    @SerializedName("company")
    private Company company;

    class Company{
        @SerializedName("name")
        private String name;
        @SerializedName("catchPhrase")
        private String catchPhrase;
        @SerializedName("bs")
        private String bs;
    }
    class Address{
        @SerializedName("street")
        private String street;
        @SerializedName("suite")
        private String suite;
        @SerializedName("city")
        private String city;
        @SerializedName("zipcode")
        private String zipCode;
        @SerializedName("geo")
        private Geo geo;


        class Geo{
            @SerializedName("lat")
            private String lat;
            @SerializedName("lng")
            private String lng;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getStreet(){
        return address.street;
    }
    public String getSuite(){
        return address.suite;
    }
    public String getCity(){
        return address.city;
    }
    public String getZipCode(){
        return address.zipCode;
    }
    public String getLat(){
        return address.geo.lat;
    }
    public String getLng(){
        return address.geo.lng;
    }

    public String getCompanyName(){
        return company.name;
    }
    public String getCatchPhrase(){
        return company.catchPhrase;
    }
    public String getBs(){
        return company.bs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        address.city = city;
    }
    public void setSuite(String suite) {
        address.suite = suite;
    }
    public void setStreet(String street) {
        address.street = street;
    }
    public void setZipCode(String zipCode) {
        address.zipCode = zipCode;
    }
    public void setLat(String lat) {
        address.geo.lat = lat;
    }
    public void setLng(String lng) {
        address.geo.lng = lng;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setCompanyName(String companyName) {
        company.name = companyName;
    }
    public void setCatchPhrase(String catchPhrase) {
        company.catchPhrase = catchPhrase;
    }
    public void setBs(String bs) {
        company.bs = bs;
    }
}
