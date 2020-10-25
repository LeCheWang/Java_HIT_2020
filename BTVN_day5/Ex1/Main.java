package BTVN_day5.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Nhap so dieu hoa: ");
        n=scan.nextInt();
        ArrayList<DieuHoa> list =new ArrayList<>();
        for(int i=0; i<n; i++){
            DieuHoa k=new DieuHoa();
            System.out.println("Nhap thong tin điều hòa thứ " +(i+1));
            k.Input();
            list.add(k);
        }
        System.out.println("====================NHỮNG ĐH CÓ HÃNG ELEXTROLUC VÀ GIA RẺ NHẤT=====================");
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã sản phẩm", "Tên sản phẩm", "Hãng sản xuất", "Ngày nhập", "Công suất", "Giá bán");
//        for (DieuHoa d: list ) {
//            d.Output();
//        }
        int d=0;
        //giá bán thấp nhất
        double min=list.get(0).getGiaBan();
        for (int i=1; i<n; i++){
            if (min>list.get(i).getGiaBan()) min=list.get(i).getGiaBan();
        }
        //hãng sx Elex
        for (int i=0; i<n; i++){
            if ("Ele".equalsIgnoreCase(list.get(i).getTenHangSX()) && list.get(i).getGiaBan()==min){
                list.get(i).Output();
                d++;
            }
        }
        if (d==0) System.out.println("====KHONG CO SAN PHAM NAO====");





    }
}
