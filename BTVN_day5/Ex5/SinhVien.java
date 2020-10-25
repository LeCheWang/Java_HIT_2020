package BTVN_day5.Ex5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String maSV, nganh;
    private int khoaHoc;
    public void Inp(){
        super.Nhap();
        System.out.println("ENTER STUDENT CODE: ");
        maSV=sc.nextLine();
        System.out.println("ENTER MAJOR: ");
        nganh=sc.nextLine();
        System.out.println("ENTER COURSE(number): ");
        khoaHoc=sc.nextInt();
    }
    public void Outp(){
        super.Xuat();
        System.out.format("%-20s%-20s%-20d\n", maSV, nganh, khoaHoc );
    }
    public SinhVien(String hoTen, String ngaySinh, String queQuan, Scanner sc, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan, sc);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien(){
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}
