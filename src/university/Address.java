package university;

public class Address {
    private String streetInfo;
    private String city;
    private String postalcode;
    private String province;
    private String country;

    public Address(String streetInfo, String city, String postalcode, String province, String country) {
        this.streetInfo = streetInfo;
        this.city = city;
        this.postalcode = postalcode;
        this.province = province;
        this.country = country;
    }

    public String getStreetInfo() {
        return streetInfo;
    }

    public String getCity() {
        return city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return streetInfo + ", " + city + ", " + postalcode + ", " + province + ", " + country;
    }
}