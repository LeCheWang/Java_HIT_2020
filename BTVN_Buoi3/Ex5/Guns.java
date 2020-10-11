package Ex5;

import java.util.Scanner;

public class Guns {
        private String weaponName;
        private int ammoNumber;
        Scanner in=new Scanner(System.in);
        public void Load(int x){
             ammoNumber+=x;
        }
        public void Shoot(int x){
            if (ammoNumber-x>=0) Load(-x);
                else System.out.println("số đạn còn lại không đủ");
            if (ammoNumber==0)
                System.out.println("hết đạn ồi, k bắn được nữa ồi huhu");
        }
        public void check(){
            System.out.print(weaponName+"("+ammoNumber+") \t");
        }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }
    public Guns() {
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
