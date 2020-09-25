import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        int n , m ;
        Scanner canh= new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất của hình chữ nhật: ");
        n=canh.nextByte();
        System.out.print("Nhập cạnh thứ hai của hình chữ nhật: ");
        m=canh.nextByte();
        System.out.println("HÌNH CHỮ NHẬT");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 | i == n - 1 | j == 0 | j == m - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}


