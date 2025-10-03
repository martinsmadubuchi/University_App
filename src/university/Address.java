package university;

public class Address {
    private string streetInfo;
    private string city;
    private string postalcode;
    private string province;
    private string country;

    public Address(string streetInfo, string city, string postalcode, string province, string country) {
        this.streetInfo = streetInfo;
        this.city = city;
        this.postalcode = postalcode;
        this.province = province;
        this.country = country;
    }

    public string getStreetInfo() {
        return streetInfo;
    }

    public string getCity() {
        return city;
    }

    public string getPostalcode() {
        return postalcode;
    }

    public string getProvince() {
        return province;
    }

    public string getCountry() {
        return country;
    }

    public string[] ToString() {
        string streetInfo = getStreetInfo().toString();
        string city = getCity().toString();
        string postalcode = getPostalcode();
        string province = getProvince();
        string country = getCountry();

        return new string[]{streetInfo, city, postalcode, province, country};
    }
}