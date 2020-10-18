package BTVN_day4.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so nhan su: ");
        int n=sc.nextInt();
        NHANSU []x=new NHANSU[n];
        for (int i=0; i<n; i++){
            x[i]=new NHANSU();
            System.out.println("Nhap thong tin nhan su thu "+ (i+1));
            x[i].Nhap();
        }
        System.out.format("%-20s%-20s%s\n", "MA NHAN SU", "HO TEN", "NGAY SINH");
        for ( NHANSU s:x ) {
            s.Xuat();
        }

    }
}
