import java.util.Date;

public class PersonData {

    private int id;
    private String name;
    private String email;
    private String country;
    private String phoneNumber;
    private Date joinDate;
    private String companyName;
    private String password;
    private Date updateJoinDate;

    public PersonData() {
    }

    public PersonData(int id, String name, String email, String country, String phoneNumber, Date joinDate,
            String companyName, String password, Date updateJoinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.joinDate = joinDate;
        this.companyName = companyName;
        this.password = password;
        this.updateJoinDate = updateJoinDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateJoinDate() {
        return updateJoinDate;
    }

    public void setUpdateJoinDate(Date updateJoinDate) {
        this.updateJoinDate = updateJoinDate;
    }

    @Override
    public String toString() {
        return "PersonData [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country
                + ", phoneNumber=" + phoneNumber + ", joinDate=" + joinDate + ", companyName=" + companyName
                + ", password=" + password + ", updateJoinDate=" + updateJoinDate + "]";
    }

}
