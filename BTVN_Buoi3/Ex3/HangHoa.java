package Ex3;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuoong;
    HangHoa(){
    }
    HangHoa (String mH, String tH, double dG, int sL){
        maHang=mH;
        tenHang=tH;
        donGia=dG;
        soLuoong=sL;
    }
    public void Xuat(){
        System.out.println("Ma hang: " +maHang);
        System.out.println("Ten hang: " +tenHang);
        System.out.println("Don gia: " +donGia);
        System.out.println("So Luong: " +soLuoong);
    }
    public void setMaHang(String mHang){
        this.maHang=mHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuoong() {
        return soLuoong;
    }

    public void setSoLuoong(int soLuoong) {
        this.soLuoong = soLuoong;
    }
}
