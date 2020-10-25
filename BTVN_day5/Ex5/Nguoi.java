package BTVN_day5.Ex5;

import java.util.Scanner;

public class Nguoi {
    private String hoTen, ngaySinh, queQuan;
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh=sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan=sc.nextLine();
    }
    public void Xuat(){
        System.out.format("%-20s%-20s%-20s", hoTen, ngaySinh, queQuan);
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan, Scanner sc) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.sc = sc;
    }

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
