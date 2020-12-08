package Nguoi;

public class PhucVu extends NhanVien{
    String caLam, viTri;
    int soNgayNghi;


    public PhucVu(String maNhanVien,String name, String gender, int age,  int ngayLamViec, String caLam, String viTri, int soNgayNghi) {
        super( maNhanVien,name, gender, age, ngayLamViec);
        this.caLam = caLam;
        this.viTri = viTri;
        this.soNgayNghi = soNgayNghi;
    }
    public void Output(){
        System.out.printf("%-20s%-20s%-10s%-10d%-10d%-15s%-20s%-20d\n", getMaNhanVien(), getName(), getGender(), getAge(), getNgayLamViec(), caLam, viTri, soNgayNghi);
    }

    public long Luong(){
        if (viTri.compareToIgnoreCase("BOI BAN")==0 )
            return 4500000*getNgayLamViec()/26-100000*getSoNgayNghi();
        else if(viTri.compareToIgnoreCase("LE TAN")==0)
            return 4000000*getNgayLamViec()/26-100000*getSoNgayNghi();
        else return 3500000*getNgayLamViec()/26-100000*getSoNgayNghi();
    }

    public PhucVu(String maNhanVien, int ngayLamViec, String caLam, String viTri, int soNgayNghi) {
        super(maNhanVien, ngayLamViec);
        this.caLam = caLam;
        this.viTri = viTri;
        this.soNgayNghi = soNgayNghi;
    }

    public PhucVu(String caLam, String viTri, int soNgayNghi) {
        this.caLam = caLam;
        this.viTri = viTri;
        this.soNgayNghi = soNgayNghi;
    }

    public String getCaLam() {
        return caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    @Override
    public String toString() {
        return "PhucVu{" +
                "Mã Nhân Viên: "+getMaNhanVien()+
                "Tên: "+getName()+
                "Giới tính: "+getGender()+
                "Tuổi: "+getAge()+
                "Số Ngày Làm Việc: "+ getNgayLamViec()+
                "caLam='" + caLam + '\'' +
                ", viTri='" + viTri + '\'' +
                ", soNgayNghi=" + soNgayNghi +
                '}';
    }
}