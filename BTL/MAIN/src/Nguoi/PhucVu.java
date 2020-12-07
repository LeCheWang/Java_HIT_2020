package Nguoi;

public class PhucVu extends NhanVien{
    String caLam, viTri;
    int soNgayNghi;


    public PhucVu(String name, String gender, int age, String maNhanVien, int ngayLamViec, String caLam, String viTri, int soNgayNghi) {
        super(name, gender, age, maNhanVien, ngayLamViec);
        this.caLam = caLam;
        this.viTri = viTri;
        this.soNgayNghi = soNgayNghi;
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
}