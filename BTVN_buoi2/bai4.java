import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        int n;
        Scanner zoo = new Scanner(System.in);
        n=zoo.nextInt();
        int []a= new int[n];
        int []prime = new int[n];
        prime=tao_mang_snt(n);
        System.out.println("\n==NHẬP MẢNG SỐ NGUYÊN KHÔNG ÂM==");
        for  (int i=0; i<n; i++)
            a[i]=zoo.nextInt();
        int S=0;
        for (int i=0; i<n; i++){
            S+= isPrime(a[i]) ? a[i]+prime[i]-i : a[i] ;
        }
        System.out.printf("TỔNG S: %d ",S);
    }
    public static boolean isPrime (int s){
        for (int i=2; i<=Math.sqrt(s); i++)
            if (s%i==0) return false;
        return s>1;
    }
    public static int []tao_mang_snt (int n){
        int []array_prime=new int[n];
        int dem=2;
        int index=0;
        do{
            if ( isPrime(dem) ) {
                array_prime[index++]=dem;
            }
            dem++;
        }while (index != n );
    return array_prime;
    }
}
