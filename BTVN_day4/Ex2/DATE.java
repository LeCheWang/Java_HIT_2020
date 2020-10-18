package BTVN_day4.Ex2;

import java.util.Scanner;

public class DATE {
    int d, m, y;
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ngay: ");
        d=sc.nextInt();
        System.out.println("Nhap thang: ");
        m=sc.nextInt();
        System.out.println("Nhap nam: ");
        y=sc.nextInt();
    }
    public void Xuat(){
        System.out.format("%d/%d/%d\n", d, m, y);
    }
}
