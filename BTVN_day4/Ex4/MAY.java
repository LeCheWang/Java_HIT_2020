package BTVN_day4.Ex4;

import java.util.Scanner;

public class MAY {
    String maMay, kieuMay, tinhTrang;
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ma may: ");
        maMay=sc.nextLine();
        System.out.println("Nhap kieu may: ");
        kieuMay=sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang=sc.nextLine();
    }
    public void Xuat(){
        System.out.format("%-20s%-20s%-20s\n", maMay, kieuMay, tinhTrang);
    }
}
