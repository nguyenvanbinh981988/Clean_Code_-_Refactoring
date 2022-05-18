package Quan_ly_nhan_vien;

import java.util.Date;

public abstract class Employer {
    private String name;

    private Date birthOfDay;

    private String  sex;

    private String address;

    public Employer(){}

    public Employer(String name, Date birthOfDay, String sex,String address){
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.sex = sex;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthOfDay(Date birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getBirthOfDay() {
        return birthOfDay;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public abstract String toString();
}
