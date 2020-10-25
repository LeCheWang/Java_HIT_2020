package BTVN_day5.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class PHIEU {
    private String maPhieu, tenPhieu;
    DateTime a=new DateTime();
    ArrayList <SanPham> x = new ArrayList<>();
    private int n;
    private double sum=0;
    Scanner sc=new Scanner(System.in);
    public void InputPhieu(){
        System.out.println("NHẬP MÃ PHIẾU : ");
        maPhieu=sc.nextLine();
        System.out.println("NHẬP TÊN PHIẾU: ");
        tenPhieu=sc.nextLine();
        System.out.println("====ENTER TIME=====");
        a.InputDate();
        System.out.println("====ENTER PRODUCT====");
        System.out.println("NHẬP SỐ SẢN PHẨM: ");
        n=sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.printf("=====NHAP SAN PHAM THU %d =====\n", (i+1) );
            SanPham k=new SanPham();
            k.InputSP();  sum+=k.getDonGia()*k.getSoLuong();
            x.add(k);
        }
    }
    public void OutputPhieu(){
        System.out.println("======================PHIEU "+ tenPhieu +"========================");
        System.out.println("MA PHIEU: " + maPhieu);
        System.out.print("TIME: "); a.OutputDate();
        System.out.println("\t\t\t\t\t*** HOA DON ***");
        System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "MA SP", "TEN SP", "SO LUONG", "DON GIA", "THANH TIEN" );
        for ( SanPham sp: x  ) {
            sp.OutputSP();
        }

        System.out.format("%78s: %.1f","TONG TIEN" ,sum);

    }
}

