import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner zo = new Scanner(System.in);
        String ch= zo.nextLine();
        int sum=0;
        int d=0;
        for (int i=0; i<ch.length(); i++) {
            char s = ch.charAt(i);
            if (Character.isDigit(s)) {
                sum += Integer.parseInt(String.valueOf(s));
                d++;
            }
        }
        System.out.println((float) sum / d);
    }

}
