package KhachHang;

public class KhachAnTaiCho extends Khach {
    private int soBan;

    public KhachAnTaiCho(String IDKhach, String tenKhach, int soBan) {
        super(IDKhach, tenKhach);
        this.soBan = soBan;
    }
    public void Output(){
        System.out.printf("%-20s%-20s%-20d\n", getIDKhach(), getTenKhach(), soBan);
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
}
