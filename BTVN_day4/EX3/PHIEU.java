package BTVN_day4.EX3;
import java.util.Scanner;

public class PHIEU {
    private String maPhieu;
    private int n;
    HANG []x;
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ma phieu: ");
        maPhieu=sc.nextLine();
        System.out.println("Nhap so HANG: ");
        n=sc.nextInt();
        x=new HANG[n];
        for (int i=0; i<n; i++){
            x[i]=new HANG();
            System.out.println("Hang thu "+(i+1));
            x[i].Nhap();
        }
    }
    public double SUM(){
        double sum=0;
        for (int i=0; i<n; i++){
            sum+=x[i].getDonGia();
        }
        return sum;
    }
    public void Xuat(){
        System.out.println("Ma phieu: "+maPhieu);
        System.out.format("%-20s %-20s %-20s\n", "MA HANG", "TEN HANG", "DON GIA");
        for (int i=0; i<n; i++){
            x[i].Xuat();

        }
        System.out.format("TONG TIEN: "+ SUM());
    }

}
