package BTVN_day5.Ex1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private double congSuat;
    private double giaBan;
    Scanner sc=new Scanner(System.in);
    public void Input (){
        super.Nhap();
        System.out.println("Nhap cong suất: ");
        congSuat=sc.nextDouble();
        System.out.println("Nhap gia ban: ");
        giaBan=sc.nextDouble();
    }
    public void Output(){
        super.Xuat();
        System.out.format("%-20.1f%-20.1f\n", congSuat, giaBan);
    }

    public DieuHoa(String maSP, String tenSP, String tenHangSX, String ngayNhap, double congSuat, double giaBan) {
        super(maSP, tenSP, tenHangSX, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public DieuHoa() {
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
