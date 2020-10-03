import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner okee = new Scanner(System.in);
        int n = okee.nextInt();
        int []a=  new int [n];
        for (int i=0; i<n; i++){
            a[i]=okee.nextInt();
        }
        System.out.println("\n=====MENU======\n");
        System.out.println("1. Hiển thị mảng vừa nhập");
        System.out.println("2. Thêm một phần tử tù vị trí k");
        System.out.println("3. Xóa một phần tử ở vị trí k");
        System.out.println("4. Đảo ngược mảng");
        System.out.println("5. Hiển thị phần tử A[1] và các phần tử chia hết cho A[i]");
        System.out.println("6. Thoát");
        int menu;
        System.out.print("Please choose: ");
        menu=okee.nextByte();
        switch (menu){
            case 1:
                System.out.println("MẢNG VỪA NHẬP LÀ: ");
                out_array(a,n);
                break;
            case 2:
                System.out.print("Nhập vị trí k: ");
                int k=okee.nextInt();
                System.out.print("Nhập gia trị cần chèn: ");
                int x=okee.nextInt();
                a=chen(a,k,x);
                System.out.print("MẢNG ĐÃ CHÈN: ");
                out_array(a,a.length);
                break;
            case 3:
                System.out.print("Nhập vị trí k: ");
                int h=okee.nextInt();
                a=xoa(a,h);
                System.out.print("MẢNG ĐÃ XOA: ");
                out_array(a,a.length);
                break;
            case 4:
                System.out.print("MẢNG ĐẢO NGƯỢC: ");
                for (int i=a.length-1; i>=0; i--)
                    System.out.print(a[i] + " ");
                break;
            case 5:
                System.out.print("A[1]= " +a[1]);
                System.out.printf("\nCÁC SỐ CHIA HẾT CHO %d LÀ: ", a[1]);
                int d=0;
                for (int i=0; i<n; i++)
                    if(a[i]%a[1]==0) {
                        System.out.print(a[i] + " ");
                        d++;
                    }
                if (d==0) System.out.print("KHÔNG CÓ SỐ NÀO");
                break;
            case 6:
                break;
            default:
                System.out.println("Lựa chọn không phù hợp");
        }
    }
    public static void out_array (int []a, int n){

        for (int i=0; i<n; i++)
            System.out.printf("%d ", a[i]);
    }
    public static int [] chen(int []a, int vt, int x){
        int m=a.length;
        int [] arr = new int[m+1];
        arr[m]=a[m-1];
        for (int i=m-1; i>vt; i--){
            a[i]=a[i-1];
        }
        a[vt]=x;
        for (int i=0; i<m; i++)
            arr[i]=a[i];
        return arr;
    }
    public static int [] xoa (int []a, int vt){
        int m=a.length;
        int []arr=new int[m-1];
        for (int i=vt; i<a.length-1; i++)
            a[i]=a[i+1];
        for (int i=0; i<a.length-1; i++)
            arr[i]=a[i];
        return arr;
    }
}