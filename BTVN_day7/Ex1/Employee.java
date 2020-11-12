package BTVN_day7.Ex1;

public class Employee extends Person  {
    private int  salary;
    public Employee(String name, String address, int salary){
        super (name, address);
        this.salary=salary;
    }
    @Override
    public void display(){
        System.out.println("Employee name: "+    getName());
        System.out.println("Employee address: "+ getAddress());
        System.out.println("Employee salary: "+  salary);
    }


}
