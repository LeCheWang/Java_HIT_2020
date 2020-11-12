package BTVN_day7.Ex1;

public class Customer extends Person{
    private int balance;
    public Customer(String name, String address, int balance){
        super(name, address);
        this.balance=balance;
    }
    @Override
    public void display(){
        System.out.println("Customer name: "+ getName());
        System.out.println("Customer address: "+ getAddress());
        System.out.println("Customer balamce: "+ balance);
    }

}
