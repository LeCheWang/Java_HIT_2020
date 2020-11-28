import java.util.Scanner;

public class Giamdoc extends Person{
    private String phoneNumber;
    Scanner sc=new Scanner(System.in);
    public void Input(){
        super.Input();
        System.out.println("Enter phone number: ");
        phoneNumber=sc.nextLine();
    }
    public void titel(){
        System.out.printf("%-20s%-15s%-10s%-20s\n", "NAME", "GENDER", "AGE", "PHONE NUMBER");
    };

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%-20s", phoneNumber);
    }

    public Giamdoc(String name, String gender, int age, String phoneNumber) {
        super(name, gender, age);
        this.phoneNumber = phoneNumber;
    }

    public Giamdoc(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Giamdoc(){}
}
