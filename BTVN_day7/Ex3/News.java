package BTVN_day7.Ex3;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title, pushlishDate, author, content;
    private float everageRate;
    Scanner sc=new Scanner(System.in);
// a
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPushlishDate() {
        return pushlishDate;
    }

    public void setPushlishDate(String pushlishDate) {
        this.pushlishDate = pushlishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getEverageRate() {
        return everageRate;
    }

    public void setEverageRate(float everageRate) {
        this.everageRate = everageRate;
    }
//    b c


    @Override
    public void Display() {
        System.out.printf("%-20d%-20s%-20s%-20s%-20s%-20.2f\n", id, title, pushlishDate, author, content, everageRate);
    }
    private int [] rateList =new int [3];
    void Enter_rateList(){
        System.out.println("======ENTER ARRAY=====");
        for (int i=0; i<3; i++){
            System.out.println("ENTER ELEMENT "+(i+1)+"th");
            rateList[i]= sc.nextInt();
        }
    }
    float caculate(){
        everageRate=0;
        for (int i=0; i<3; i++)
            everageRate+=rateList[i];
        everageRate/=3;
        return everageRate;
    }

    public News(){

    }
}
