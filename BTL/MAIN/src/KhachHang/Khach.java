package KhachHang;

public class Khach {
    private String IDKhach;
    private String tenKhach;

    public Khach(String IDKhach, String tenKhach) {
        this.IDKhach = IDKhach;
        this.tenKhach = tenKhach;
    }

    public String getIDKhach() {
        return IDKhach;
    }

    public void setIDKhach(String IDKhach) {
        this.IDKhach = IDKhach;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }
}
