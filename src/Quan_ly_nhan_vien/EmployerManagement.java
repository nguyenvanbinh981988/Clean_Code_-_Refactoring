package Quan_ly_nhan_vien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployerManagement {
    Scanner scanner = new Scanner(System.in);
    Employer[] Employ = new Employer[0];

    public void menu() throws ParseException {
        System.out.println("Menu");
        System.out.println("1. Them");
        System.out.println("2. Tim kiem theo ten");
        System.out.println("3. Hien thi ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
                findName();
                break;
            case 3:
                show();
                break;
            case 4:
                System.exit(0);
        }
    }


    public void create() throws ParseException {
        System.out.println("Menu");
        System.out.println("1. Engineer");
        System.out.println("2. Worker");
        System.out.println("3. Staff");
        int choice1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter BirthToDay");
        String date = scanner.nextLine();
        Date birthToDay = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println("Enter Sex");
        String sex = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();

        Employer[] newEmploy = new Employer[Employ.length + 1];

        switch (choice1) {
            case 1:
                System.out.println("Enter WorkField");
                String workField = scanner.nextLine();
                Employer newNV = new Engineer(name, birthToDay, sex, address, workField);
                for (int i = 0; i < Employ.length; i++) {
                    newEmploy[i] = Employ[i];
                }
                newEmploy[Employ.length] = newNV;
                break;
            case 2:
                System.out.println("Enter Bac");
                double bac = Double.parseDouble(scanner.nextLine());
                Employer newNV1 = new Worker(name, birthToDay, sex, address, bac);
                for (int i = 0; i < Employ.length; i++) {
                    newEmploy[i] = Employ[i];
                }
                newEmploy[Employ.length] = newNV1;
                break;
            case 3:
                System.out.println("Enter Job");
                String job = scanner.nextLine();
                Employer newNV2 = new Staff(name, birthToDay, sex, address, job);
                for (int i = 0; i < Employ.length; i++) {
                    newEmploy[i] = Employ[i];
                }
                newEmploy[Employ.length] = newNV2;
                break;
        }
        Employ = newEmploy;
    }

    public void findName() {
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        for (int i = 0; i < Employ.length; i++) {
            if (name.equals(Employ[i].getName())) {
                System.out.println(Employ[i].toString());
            }
        }
    }

    public void show() {
        for (Employer nv : Employ) {
            System.out.println(nv.toString());
        }
    }
}
