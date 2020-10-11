package Ex1;

public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String hobby;
    Person(){
        name="Ha Van Phong";
        dateOfBirth="13/01/2001";
        gender="Nam";
        hobby="sing karaoke";
    }
    Person (String ten, String sn, String gt, String st){
        name=ten;
        dateOfBirth=sn;
        gender=gt;
        hobby=st;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
