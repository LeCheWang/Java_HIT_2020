import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner oki = new Scanner(System.in);
        int n;
        n=oki.nextInt();
        int []A=new int[n];
        System.out.println("====NHAP MANG===\n");
        for (int i=0; i<n; i++){
            A[i]=oki.nextInt();
        }
       sort_array(A,n);
        System.out.println("MIN: " +A[0]);
        System.out.println("MAX: " +A[n-1]);
        System.out.println("===THE ARRAY HAS BEEN SORTED===");
        out_array(A,n);
    }
    public static void sort_array (int []A, int n){
        int swap;
        for (int i=0;i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if(A[i]>A[j]) {
                    swap=A[i];
                    A[i]=A[j];
                    A[j]=swap;
                }
    }
    public static void out_array (int []A, int n){
        for (int i=0; i<n; i++){
            System.out.print(+A[i] + " ");
        }
    }


}
