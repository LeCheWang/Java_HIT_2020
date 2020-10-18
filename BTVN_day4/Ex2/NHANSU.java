package BTVN_day4.Ex2;

import java.util.Scanner;

public class NHANSU {
    String maNs;
    String hoTen;
    DATE nS=new DATE();
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ma nhan su: ");
        maNs=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("====Ngay thang nam sinh====");
        nS.Nhap();
       }
    public void Xuat(){
        System.out.format("%-20s%-20s", maNs, hoTen);
        nS.Xuat();
    }

}
