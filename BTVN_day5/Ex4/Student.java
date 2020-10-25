package BTVN_day5.Ex4;

import java.util.Scanner;

public class Student {
    private String id, name, age, address;
    private double gpa;
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.println("ENTER ID: ");
        id=sc.nextLine();
        System.out.println("ENTER STD NAME: ");
        name=sc.nextLine();
        System.out.println("ENTER STD AGE: ");
        age=sc.nextLine();
        System.out.println("ENTER STD ADDRESS:");
        address=sc.nextLine();
        System.out.println("ENTER STD GPA: ");
        gpa=sc.nextDouble();
    }
    public void Output(){
        System.out.format("%-20s%-20s%-20s%-20s%-20.1f\n", id, name, age, address, gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
