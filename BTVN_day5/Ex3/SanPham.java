package BTVN_day5.Ex3;

import java.util.Scanner;

public class SanPham {
    private String maSP, tenSP;
    private double soLuong, donGia;
    Scanner sc=new Scanner(System.in);
    public void InputSP(){
        System.out.println("ENTER PRODUCT CODE: ");
        maSP=sc.nextLine();
        System.out.println("ENTER PRODUCT NAME: ");
        tenSP=sc.nextLine();
        System.out.println("ENTER THE PRODUCT NUMBER: ");
        soLuong=sc.nextDouble();
        System.out.println("ENTER PRODUCT PRICE: ");
        donGia=sc.nextDouble();
    }
    public void OutputSP (){
        System.out.format("%-20s%-20s%-20.1f%-20.1f%-20.1f\n", maSP, tenSP, soLuong, donGia, soLuong*donGia );
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
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
