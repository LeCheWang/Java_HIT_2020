package BTVN_day4.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class PHONGMAY {
        String  maPhong, tenPhong;
        double  dienTich;
        int n;
        QUANLY x=new QUANLY();
        ArrayList <MAY> may = new ArrayList<MAY>();
        MAY []y;
        Scanner sc=new Scanner(System.in);
        public void Nhap(){
            System.out.println("Nhap ma phong: ");
            maPhong=sc.nextLine();
            System.out.println("Nhap ten phong: ");
            tenPhong=sc.nextLine();
            System.out.println("Nhap dien tich: ");
            dienTich=sc.nextDouble();
            System.out.println("=======QUAN LY========");
            x.Nhap();
            System.out.println("Nhap so luong may: ");
            n=sc.nextInt();
            y=new MAY[n];
            for (int i=0; i<n; i++){
                System.out.println("Máy thứ "+ (i+1));
                y[i]=new MAY();
                y[i].Nhap();
                may.add(y[i]);
            }
        }
        public void Xuat(){
            System.out.println("====PHONG MAY=====");
            System.out.println("MA PHONG: " +maPhong);
            System.out.println("TEN PHONG: "+ tenPhong);
            System.out.println("DIEN TICH: "+ dienTich +"m2");
            System.out.println("====QUAN lY====");
            x.Xuat();
            System.out.println("====MAY=====");
            System.out.format("%-20s%-20s%-20s\n", "MA MAY", "KIEU MAY", "TINH TRANG");
            for (int i=0; i<n; i++){
                may.get(i).Xuat();
            }
//            for (MAY a: may ) {
//                a.Xuat();
//
//            }
//            for (int i=0; i<n; i++){
//                y[i].Xuat();
//            }
        }

}
