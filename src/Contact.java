public class Contact {

    private String FName;
    private String LName;
    private int id;
    private String phoneNumber;
    private String cityName;
    private String address;
    private String countryName;
    private String emailAddress;
    private String website;
    private String mobile;
    private String company;
    private String dob;


    public String getFName() {
        return FName;
    }


    public void setFName(String FName) {
        this.FName = FName;
    }


    public String getLName() {
        return LName;
    }


    public void setLName(String LName) {
        this.LName = LName;
    }


    public int getId() {
        return id;
    }


    public void setId(int iD) {
        id = iD;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }



    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return this.address;
    }



    public String getCountryName() {
        return countryName;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getWebsite() {
        return website;
    }


    public void setWebsite(String website) {
        this.website = website;
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getCompany() {
        return company;
    }


    public void setCompany(String company) {
        this.company = company;
    }


    public String getDob() {
        return dob;
    }


    public void setDob(String dob) {
        this.dob = dob;
    }


    public String Display()
    {
        return " FirstName : "+this.FName + " \n Last Name : "+this.LName +"\n ID : "+this.id +"\n Phone Number : "+this.phoneNumber+"\n Mobile Number : "+this.mobile +"\n Email Address : "+this.emailAddress+"\n City : "+this.cityName+"\n Country : "+this.countryName+"\n Website : "+this.website+"\n Residential Address : "+this.address +"\n Company : "+this.company+"\n Date of Birth : "+this.dob;
    }

}
