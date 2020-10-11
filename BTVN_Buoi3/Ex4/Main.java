package Ex4;

public class Main {
    public static void main(String[] args) {
        Array arr1=new Array();
        Array arr2=new Array();
        System.out.println("++++ARR1+++++");
        arr1.InpuData();
        System.out.println("++++ARR2+++++");
        arr2.InpuData();
        System.out.print("\narr1: ");
        arr1.Show();
        System.out.print("\narr2: ");
        arr2.Show();
        if(arr1.Sum()/arr1.getN()>arr2.Sum()/ arr2.getN())
            System.out.println("\narr1 > arr2");
            else if(arr1.Sum()/arr1.getN()<arr2.Sum()/ arr2.getN())
                System.out.println("\narr1 < arr2");
                 else System.out.println("\nHi");


    }
}
