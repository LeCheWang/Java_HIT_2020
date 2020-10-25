package BTVN_day5.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int choice, n;
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> std = new ArrayList<Student>();
        do{
            System.out.println("/****************************************/\n" +
                    "1.Add student\t" +
                    "2.Edit student by id\t" +
                    "3.Delete student by id\t" +
                    "4.Sort students by gpa\t" +
                    "5.Sort students by name\t" +
                    "6.Show students\t" +
                    "0.Exit\n" +
                    "/****************************************/\n" +
                    "Your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("YOU ARE WELCOME");
                    break;
                case 1:
                    System.out.println("HOW MANY STD: "); n=sc.nextInt();
                    for (int i=0; i<n; i++){
                        Student k=new Student();
                        System.out.println("== ENTER THE "+(i+1)  +"th STD ==");
                        k.Input();
                        std.add(k);
                    }
                    System.out.println("ĐÃ NHẬP XONG");
                    break;
                case 2:
                    sc.nextLine();
                    int d=0;
                    System.out.println("NHAP ID CẦN EDIT: ");
                    String idEdit=sc.nextLine();
                    for (int i=0; i<std.size(); i++){
                        if(idEdit.equals(std.get(i).getId())){
                            Student k=new Student();
                            System.out.println("=====THONG TIN CHINH SUA=====");
                            k.Input();
                            std.remove(i);
                            std.add(i, k);
                            d++;
                        }
                    }
                    if(d==0) System.out.println("ID WAS NOT FOUND");
                    else System.out.println("ĐÃ CHỈNH SỬA");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("NHAP ID CAN XOA: ");
                    String idcheck=sc.nextLine();
                    for (int i=0; i<std.size(); i++){
                       if (idcheck.equalsIgnoreCase(std.get(i).getId()) )
                           std.remove(i);
                    }
                    System.out.println("ĐÃ  XÓA XONG");
                    break;
                case 4:
                    for (int i=0; i<std.size()-1; i++)
                        for (int j=i+1; j<std.size(); j++){
                            if(std.get(i).getGpa() > std.get(j).getGpa()){
                                Student temp=std.get(i);
                                std.set(i, std.get(j));
                                std.set(j, temp);
                            }
                        }
                    System.out.println("ĐÃ SẮP XẾP THEO GPA");
                    break;
                case 5:
                    for (int i=0; i<std.size()-1; i++)
                        for (int j=i+1; j<std.size(); j++){
                            if(std.get(i).getName().compareToIgnoreCase(std.get(j).getName())>0){
                                Student temp=std.get(i);
                                std.set(i, std.get(j));
                                std.set(j, temp);
                            }
                        }
                    System.out.println("ĐÃ SẮP XẾP THEO TÊN");
                    break;
                case 6:
                    System.out.println("===SHOW STUDENT===");
                    System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "ID", "NAME", "AGE", "ADDRESS", "GPA");
                    for ( Student a: std ) {
                        a.Output();
                    }
                    break;

                default:
                    System.out.println("Chọn SAIIIIIIIIIIIII");
            }
        } while(choice!=0);

    }

}
