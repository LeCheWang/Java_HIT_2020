package BTVN_day7.Ex1;

public class RunMain {
    public static void main(String[] args) {
        Person ps1=new Employee("Trung", "HN", 30000);
        Person ps2 =new Customer("Linh", "BN", 50000);
        ps1.display();
        ps2.display();
    }
}
