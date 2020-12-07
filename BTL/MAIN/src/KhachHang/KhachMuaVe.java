package KhachHang;

public class KhachMuaVe extends Khach{
    private int soMonAn;

    public KhachMuaVe(String IDKhach, String tenKhach, int soMonAn) {
        super(IDKhach, tenKhach);
        this.soMonAn = soMonAn;
    }

    public int getSoMonAn() {
        return soMonAn;
    }

    public void setSoMonAn(int soMonAn) {
        this.soMonAn = soMonAn;
    }
}
