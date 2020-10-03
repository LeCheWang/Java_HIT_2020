import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        int a,b,c;
        a=oke.nextInt();
        b=oke.nextInt();
        c=oke.nextInt();
        System.out.println(find_max(find_max(a,b),c) );
    }
public static int find_max (int a, int b) {
        if (a>b) return a;
        else return b;
    }
}



