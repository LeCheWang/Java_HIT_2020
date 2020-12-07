package Nguoi;

import java.util.Scanner;

public class QuanLi extends Giamdoc{
    private int namKn;
    private String diaChi;
    Scanner sc= new Scanner(System.in);
    public  void Input(){
        System.out.println("Enter years of experience: ");
        namKn=sc.nextInt();
        super.Input();
    }
    public void title(){
        System.out.printf("\n%-20s%-15s%-10s%-20s%-20s%-20s\n", "HO-TEN", "GIỚI TÍNH", "TUỔI", "SDT", "SỐ NĂM KINH NGHIỆM", "Địa Chỉ");
    }
    @Override
    public void Output() {
        super.Output();
        System.out.printf("%-20d%-20s\n", namKn, diaChi);
    }

    public QuanLi(String name, String gender, int age, String phoneNumber, int namKn, String diaChi) {
        super(name, gender, age, phoneNumber);
        this.namKn = namKn;
        this.diaChi=diaChi;
    }

    public QuanLi(String phoneNumber, int namKn) {
        super(phoneNumber);
        this.namKn = namKn;
    }

    public QuanLi(int namKn) {
        this.namKn = namKn;
    }

    public QuanLi(){}
    public long luong(){
        return 30000000 +namKn*1000000;
    }


    public int getNamKn() {
        return namKn;
    }

    public void setNamKn(int namKn) {
        this.namKn = namKn;
    }

    @Override
    public Scanner getSc() {
        return sc;
    }

    @Override
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
