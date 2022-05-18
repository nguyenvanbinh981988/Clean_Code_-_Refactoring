package Quan_ly_nhan_vien;

import java.util.Date;

public class Worker extends Employer{
    private double bac;

    public Worker(){}

    public Worker(String name, Date birthToDay, String sex, String address, double bac){
        super(name, birthToDay, sex,address);
        this.bac = bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    public double getBac() {
        return bac;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Name=" + getName() +
                ",BirthToDay" + getBirthOfDay() +
                ",Sex=" + getSex() +
                ",Adress=" + getAddress() +
                ",Bac=" + bac +
                '}';
    }
}
