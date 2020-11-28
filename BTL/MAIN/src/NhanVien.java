import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class NhanVien extends Person{
    private String maNhanVien, boPhan;
    private int ngayLamViec;
    Scanner sc=new Scanner(System.in);
    public NhanVien(String name, String gender, int age, String maNhanVien, String boPhan, int ngayLamViec) {
        super(name, gender, age);
        this.maNhanVien = maNhanVien;
        this.boPhan = boPhan;
        this.ngayLamViec = ngayLamViec;
    }

    public NhanVien(String maNhanVien, String boPhan, int ngayLamViec) {
        this.maNhanVien = maNhanVien;
        this.boPhan = boPhan;
        this.ngayLamViec = ngayLamViec;
    }
    public NhanVien (){}

    @Override
    public void Input() {
        System.out.println("NHẬP MÃ NHÂN VIÊN: ");
        maNhanVien=sc.nextLine();
        super.Input();
        sc.nextLine();
        System.out.println("NHẬP BỘ PHẬN LÀM VIỆC: ");
        boPhan=sc.nextLine();
        System.out.println("NHẬP NGÀY BẮT ĐẦU LÀM VIỆC: ");
        ngayLamViec=sc.nextInt();
    }
    public void title(){
        System.out.printf("%-20s%-20s%-15s%-10s%-20s%-20s\n", "MÃ NHÂN VIÊN", "NAME", "GENDER", "AGE", "BỘ PHẬN", "LÀM VIỆC TỪ(ngày)");
    }
    @Override
    public void Output() {
        System.out.printf("%-20s", maNhanVien);
        super.Output();
        System.out.printf("%-20s%-20d", boPhan, ngayLamViec);

    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public int getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(int ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }
}
