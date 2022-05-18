package Quan_ly_nhan_vien;

import java.util.Date;

public class Staff extends Employer{
    private String job;

    public Staff(){}

    public Staff(String name, Date birthToDay, String sex, String address, String job){
        super(name, birthToDay, sex,address);
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Name=" + getName() +
                ",BirthToDay" + getBirthOfDay() +
                ",Sex=" + getSex() +
                ",Address=" + getAddress() +
                ",Job=" + job +
                '}';
    }
}
