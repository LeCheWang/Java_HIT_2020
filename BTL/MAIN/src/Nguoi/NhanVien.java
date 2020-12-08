package Nguoi;

import java.util.Scanner;

public class NhanVien extends Person{
    private String maNhanVien;
    private int ngayLamViec;
    Scanner sc=new Scanner(System.in);
    public NhanVien(String maNhanVien,String name, String gender, int age,  int ngayLamViec) {
        super(name, gender, age);
        this.maNhanVien = maNhanVien;
        this.ngayLamViec = ngayLamViec;
    }

    public NhanVien(String maNhanVien, int ngayLamViec) {
        this.maNhanVien = maNhanVien;
        this.ngayLamViec = ngayLamViec;
    }
    public NhanVien (){}

    @Override
    public void Input() {
        System.out.println("NHẬP MÃ NHÂN VIÊN: ");
        maNhanVien=sc.nextLine();
        super.Input();
        sc.nextLine();
        System.out.println("NHẬP BỘ PHẬN LÀM VIỆC: ");
        System.out.println("NHẬP NGÀY BẮT ĐẦU LÀM VIỆC: ");
        ngayLamViec=sc.nextInt();
    }
    public void title(){
        System.out.printf("%-20s%-20s%-15s%-10s%-20s\n", "MÃ NHÂN VIÊN", "NAME", "GENDER", "AGE",  "LÀM VIỆC TỪ(ngày)");
    }
    @Override
    public void Output() {
        System.out.printf("%-20s", maNhanVien);
        super.Output();
        System.out.printf("%-20d", ngayLamViec);

    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(int ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }
}