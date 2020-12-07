package Nguoi;

import java.util.Scanner;

public class Person {
    private String name, gender;
    private int age;
    Scanner sc=new Scanner(System.in);
    public void Input(){
//        sc.nextLine();
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter gender: (male/female)");
        gender=sc.nextLine();
        System.out.println("Enter age: ");
        age=sc.nextInt();
    }
    public void Output(){
        System.out.printf("%-20s%-15s%-10d", name, gender, age);
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
