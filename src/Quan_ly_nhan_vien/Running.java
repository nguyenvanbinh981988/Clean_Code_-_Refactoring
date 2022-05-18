package Quan_ly_nhan_vien;

import java.text.ParseException;

public class Running {
    public static void main(String[] args) throws ParseException {
        EmployerManagement employerManagement = new EmployerManagement();
        while (true){
            employerManagement.menu();
        }
    }
}
