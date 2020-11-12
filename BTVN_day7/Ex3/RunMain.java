package BTVN_day7.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<News> list =new ArrayList<>();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.printf("\n%100s\n", "==============================MENU==============================");
            System.out.printf("%96s\n", "|| 1. Insert news\t2. View list news\t3.Average rate\t4.Exit ||");
            System.out.printf("%100s\n", "================================================================");
            System.out.println("Your choice: ");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    News news= new News();
                    first_choice(news);
                    news.Enter_rateList();
                    list.add(news);
                    break;

                case 2:
                    form_Title();
                    for (News newest: list ) {
                        newest.Display();
                    }
                    break;
                case 3:
                    form_Title();
                    for (int i=0; i<list.size(); i++){
                        list.get(i).caculate();
                        list.get(i).Display();
                    }
                    break;
                case 4:
                    System.out.println("PROGRAM FISNISHED");
                    break;
                default:
                    System.out.println("WRONG CHOICE!!!!");
            }
        }while(choice!=4);
    }

    public static void first_choice(News news){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID: ");
        news.setId(sc.nextInt()); sc.nextLine();
        System.out.println("Enter title: ");
        news.setTitle(sc.nextLine());
        System.out.println("Enter push list date: ");
        news.setPushlishDate(sc.nextLine());
        System.out.println("Enter author: ");
        news.setAuthor(sc.nextLine());
        System.out.println("Enter content: ");
        news.setContent(sc.nextLine());
    }
    public static void form_Title(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID","TITLE", "PUSH LIST DATE", "AUTHOR","CONTENT","AVERAGERATE");
    }
}
