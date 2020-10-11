package Ex2;

public class Dog {
    private String name;
    private int Mp=100;
    public void InputName(String name){
        this.name=name;
    }
    public void ShowMp (){
        System.out.println("Mp= "+Mp);
    }
    public void Bark(){
        if (name.trim().isEmpty()){
            System.out.println("Xin lỗi bạn chưa điền tên");
        }
        else{
            System.out.println(name +"sủa");
            Mp-=20;
        }

    }

}
