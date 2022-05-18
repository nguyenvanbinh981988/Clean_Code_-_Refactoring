package Quan_ly_nhan_vien;

import java.util.Date;

public class Engineer extends Employer{

    private String workField;

    public Engineer(){}

    public Engineer(String name, Date birthToDay, String sex, String address, String workField){
        super(name, birthToDay, sex,address);
        this.workField = workField;
    }

    public void setWorkField(String workField) {
        this.workField = workField;
    }

    public String getWorkField() {
        return workField;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "Name=" + getName() +
                ",BirthToDay" + getBirthOfDay() +
                ",Sex=" + getSex() +
                ",Address=" + getAddress() +
                ",WorkField=" + workField +
                '}';
    }
}
