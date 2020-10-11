package Ex1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai=new Person();
        Person DiepBueDe=new Person();
        DoanXinhGai.setName("Vũ Văn Doan");
        DoanXinhGai.setDateOfBirth("13/01/2000");
        DoanXinhGai.setGender("Nữ");
        DoanXinhGai.setHobby("Ngắm gái");
        DiepBueDe.setName("Nguyễn Đức Điệp");
        DiepBueDe.setDateOfBirth("07/01/2000");
        DiepBueDe.setGender("Nam");
        DiepBueDe.setHobby("Ngắm trai đẹp");
        //hien thi
        System.out.println("Name: " +DoanXinhGai.getName());
        System.out.println("Date of birth: " +DoanXinhGai.getDateOfBirth());
        System.out.println("Gender: " +DoanXinhGai.getGender());
        System.out.println("Hobby: "+DoanXinhGai.getHobby());
        System.out.println("===================");
        System.out.println("Name: " +DiepBueDe.getName());
        System.out.println("Date of birth: "+DiepBueDe.getDateOfBirth());
        System.out.println("Gender: "+DiepBueDe.getGender());
        System.out.println("Hobby: "+DiepBueDe.getHobby());

    }



}
