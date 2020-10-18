package BTVN_day4.EX3;

import java.util.Scanner;

public class HANG {
    private String maHang;
    private String tenHang;
    private double donGia;
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ma hang: ");
        maHang=sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang=sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextDouble();
    }
    public void Xuat(){
        System.out.format("%-20s %-20s %-20.1f\n", maHang, tenHang, donGia);
    }
//contructor
    public HANG(){

    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
