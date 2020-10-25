package BTVN_day5.Ex5;

import java.util.ArrayList;
import java.util.Scanner;
public class LopHoc {
    private String maLH, tenLH, ngayMo, giaoVien;
    ArrayList<SinhVien> sv =new ArrayList<>();
    private int n;
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.println("ENTER CLASS'S CODE: ");
        maLH=sc.nextLine();
        System.out.println("ENTER CLASS'S NAME: ");
        tenLH=sc.nextLine();
        System.out.println("ENTER FOUNDED DAY: ");
        ngayMo=sc.nextLine();
        System.out.println("ENTER TEACHER OF CLASS: ");
        giaoVien=sc.nextLine();
        System.out.println("ENTER THE NUMBER OF STUDENT: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("=====THONG TIN SINH VIEN THU " +(i+1)+" ========");
            SinhVien k=new SinhVien();
            k.Inp();
            sv.add(k);
        }
    }

    private int count=0;
    public int CountK14(){
        for (SinhVien a: sv) {
            if(a.getKhoaHoc()==14) count++;
        }
        return count;
    }
    public void Sort(){
        for (int i=0; i<sv.size()-1; i++)
            for (int j=0; j<sv.size(); j++){
                if(sv.get(i).getKhoaHoc()>sv.get(j).getKhoaHoc()){
                    SinhVien temp= new SinhVien();
                    temp=sv.get(i);
                    sv.set(i, sv.get(j));
                    sv.set(j, temp);
                }
            }
    }
    public void Output(){
        System.out.println("MA LOP HOC: "+ maLH);
        System.out.println("TEN LOP HOC: "+tenLH);
        System.out.println("NGAY MO: " +ngayMo);
        System.out.println("GIAO VIEN: "+giaoVien);
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s\n", "NAME", "DATE OF BIRTH", "ADDRESS", "STD CODE", "MAJOR", "COURSE");
        for (SinhVien a: sv
             ) {
            a.Outp();
        }
    }
    public LopHoc(String maLH, String tenLH, String ngayMo, String giaoVien, ArrayList<SinhVien> sv, int n) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.giaoVien = giaoVien;
        this.sv = sv;
        this.n = n;
    }

    public LopHoc() {
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }


    public ArrayList<SinhVien> getSv() {
        return sv;
    }

    public void setSv(ArrayList<SinhVien> sv) {
        this.sv = sv;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
