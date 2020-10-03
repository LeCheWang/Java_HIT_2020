
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        String str=oke.nextLine();
        str=str.trim();
        for (int i=1; i<str.length()-1; i++){
            if (str.charAt(i)==' '&& str.charAt(i+1)==' ') {
                str = str.substring(0, i+1) + str.substring(i + 2);
                i--;
            } 
        }
        String s1= "";
            s1 +=(str.substring(0, 1).toUpperCase() + str.substring(1));
            str=s1;
        System.out.println(str);

    }
}
