package BTVN_day4.Ex1;

import java.util.Scanner;

public class SACH {
    private String maSach;
    private String tenSach;
    private String nSB;
    private int soTrang;
    private double giaTien;

    Scanner sc=new Scanner(System.in);

    public SACH() {
    }

    public void Nhap(){
        System.out.println("Nhap ma sach: ");
        maSach=sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach=sc.nextLine();
        System.out.println("Nhap Nha Xuat Ban: ");
        nSB=sc.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang=sc.nextInt();
        System.out.println("Nhap gia tien: ");
        giaTien=sc.nextDouble();
    }
    public  void Xuat(){
        System.out.format("%20s %20s %20s %20d %20.2f\n", maSach, tenSach, nSB, soTrang, giaTien);
    }
}
