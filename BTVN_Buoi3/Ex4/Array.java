package Ex4;

import java.util.Scanner;

public class Array {
    private int n;
    private int []Array;
    Scanner oke = new Scanner(System.in);
    public void InpuData() {
        System.out.println("Nhap so phan tu: ");
        n = oke.nextInt();
        Array=new int[n];
        System.out.println("Nhap mang: ");
        for (int i=0 ; i<n; i++) {
            Array[i] = oke.nextInt();
        }
    }
    public void Show() {
        for (int i=0; i<n; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public double Sum() {
        double Sum = 0;
        for (int i=0; i<n; i++) {
            Sum += Array[i];
        }
        return Sum;
    }
//==contructor
    public Array(int[] array, int n) {
        Array = array;
        this.n = n;
    }
    public Array(){
    }
//==get&seter
    public int[] getArray() {
        return Array;
    }

    public void setArray(int[] array) {
        Array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}









