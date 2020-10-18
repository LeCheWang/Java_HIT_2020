package BTVN_day4.Ex4;

import java.util.Scanner;

public class QUANLY {
    String maQl;
    String hoTen;
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ma quan li: ");
        maQl=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma QL: "+ maQl);
        System.out.println("Ho-ten: "+ hoTen);
    }
}
