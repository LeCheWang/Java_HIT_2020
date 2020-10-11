package Ex5;

import java.sql.Time;
import java.util.Scanner;
import java.util.*;
public class Runmain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Guns g1=new Guns("DOAN", 5);
        Guns g2=new Guns("TRUNG", 8);
        int X,x;
        System.out.println("================= G_A_M_E START ==================" );
        System.out.println("|*\t" +g1.getWeaponName()+"(Đạn có: "+g1.getAmmoNumber()+") $*-SOLO-*$ "+ g2.getWeaponName()+"(Đạn có: "+g2.getAmmoNumber()+") *|" );
        System.out.println("==================================================");
        do{
            System.out.print("1.NẠP ĐẠN " +g1.getWeaponName() );
            System.out.print("\t\t2.NẠP ĐẠN " +g2.getWeaponName());
            System.out.print("\t\t3."+g1.getWeaponName()+" BẮN\t\t4."+g2.getWeaponName()+" BẮN");
            System.out.print("\t\t5.OUT GAME");
            System.out.print("\n\nWARNING: ");
            if(g1.getAmmoNumber()<g2.getAmmoNumber()) System.out.println(g1.getWeaponName()+" đang ít đạn hơn " +g2.getWeaponName());
            else if (g1.getAmmoNumber()==g2.getAmmoNumber()) System.out.println(g1.getWeaponName()+" đang hòa "+g2.getWeaponName());
                else System.out.println(g2.getWeaponName()+" đang ít đạn hơn " +g1.getWeaponName());
            System.out.print("BẠN CHỌN: ");
            int menu=in.nextByte();

            switch (menu){
                case 1: System.out.print("NẠP SỐ ĐẠN: ");
                        X=in.nextInt();
                        g1.Load(X);
                        System.out.print("\t\t\t=================================\n\t\t\tTRẠNG THÁI: ");
                        g1.check();
                        g2.check();
                        System.out.println();
                        break;
                case 2: System.out.print("NẠP SỐ ĐẠN: ");
                        X=in.nextInt();
                        g2.Load(X);
                        System.out.print("\t\t\t=================================\n\t\t\tTRẠNG THÁI: ");
                        g1.check();
                        g2.check();
                        System.out.println();
                        break;
                case 3:
                        System.out.print("Bắn số đạn: ");
                        x=in.nextInt();
                        g1.Shoot(x);
                        System.out.print("\t\t\t================================\n\t\t\tTRẠNG THÁI: ");
                        g1.check();
                        g2.check();
                        System.out.println();
                        break;
                case 4:
                        System.out.print("Bắn số đạn: ");
                        x=in.nextInt();
                        g2.Shoot(x);
                        System.out.print("\t\t\t=================================\n\t\t\tTRẠNG THÁI: ");
                        g1.check();
                        g2.check();
                        System.out.println();
                        break;
                case 5: if (g1.getAmmoNumber()==g2.getAmmoNumber() ) {  //hòa
                            g1.setAmmoNumber(0);
                            g2.setAmmoNumber(0);
                        }                                                    //trả về 0 để thoát do while
                            else if (g1.getAmmoNumber()>g2.getAmmoNumber())
                                    g2.setAmmoNumber(0);
                                    else g1.setAmmoNumber(0);
                        break;
                default:
                    System.out.println("***CHỌN SAI***\nSAI THÌ CHỌN LẠI THÔI. LÀM GÌ MÀ CĂNG! :))\n");
                    break;
            }
        }while(g1.getAmmoNumber()!=0 && g2.getAmmoNumber()!=0);
        System.out.println("|*===========GAME OVER============*|");
        if (g1.getAmmoNumber()==g2.getAmmoNumber())
            System.out.println("\t\t\t  ==HÒA==");
            else if (g1.getAmmoNumber()==0 | g1.getAmmoNumber()<g2.getAmmoNumber())
                System.out.println("*** " +g2.getWeaponName()+" (Đạn còn: "+g2.getAmmoNumber()+") W_I_N ***");
                else
                    System.out.println("*** " +g1.getWeaponName()+" (Đạn còn: "+g1.getAmmoNumber()+") W_I_N ***");
        System.out.println("|=********************************=|");

    }
}
