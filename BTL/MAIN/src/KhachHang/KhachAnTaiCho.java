package KhachHang;

public class KhachAnTaiCho extends Khach {
    private int soBan;

    public KhachAnTaiCho(String IDKhach, String tenKhach, int soBan) {
        super(IDKhach, tenKhach);
        this.soBan = soBan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
}
