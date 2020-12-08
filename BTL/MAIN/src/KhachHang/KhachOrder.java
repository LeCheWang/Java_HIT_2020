package KhachHang;

public class KhachOrder extends Khach{
    private String soDT;
    private String diaChi;

    public KhachOrder(String IDKhach, String tenKhach, String soDT, String diaChi) {
        super(IDKhach, tenKhach);
        this.soDT = soDT;
        this.diaChi = diaChi;
    }
    public void Outpu(){
        System.out.printf("%-20s%-20s%-20s%-20s\n", getIDKhach(), getTenKhach(), soDT, diaChi);
    }
    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
