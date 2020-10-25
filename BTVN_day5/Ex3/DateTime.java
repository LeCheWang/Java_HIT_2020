package BTVN_day5.Ex3;

import java.util.Scanner;

public class DateTime {
    private String d, m, y;
    Scanner sc=new Scanner(System.in);
    public void InputDate(){
        System.out.println("ENTER DAY: ");
        d=sc.nextLine();
        System.out.println("ENTER MONTH: ");
        m=sc.nextLine();
        System.out.println("ENTER YEAR: ");
        y=sc.nextLine();
    }
    public void OutputDate(){
        System.out.printf("%s/%s/%s\n", d,m,y);
    }
}
