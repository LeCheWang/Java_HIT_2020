package BTVN_day5.Ex1;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String tenHangSX;
    private String ngayNhap;
    Scanner sc =new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ma san pham: ");
        maSP=sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSP=sc.nextLine();
        System.out.println("Nhap ten hang sx: ");
        tenHangSX=sc.nextLine();
        System.out.println("Nhap ngay nhap: ");
        ngayNhap=sc.nextLine();
    }
    public void Xuat(){
        System.out.format("%-20s%-20s%-20s%-20s", maSP, tenSP, tenHangSX, ngayNhap );
    }

    public SanPham(String maSP, String tenSP, String tenHangSX, String ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenHangSX = tenHangSX;
        this.ngayNhap = ngayNhap;
    }

    public SanPham() {
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

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
