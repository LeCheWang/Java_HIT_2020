package BTVN_day4.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so sach: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        SACH [] a=new SACH[n];
        for (int i=0; i<n; i++){
           a[i]=new SACH();
            System.out.println("NHAP SACH SO "+ (i+1));
            a[i].Nhap();
        }
        System.out.format("%20s %20s %20s %20s %20s\n", "Ma sach", "Ten sach", "NSN", "So trang", "Gia");
        for (SACH sach: a){
            sach.Xuat();
        }

    }
}
