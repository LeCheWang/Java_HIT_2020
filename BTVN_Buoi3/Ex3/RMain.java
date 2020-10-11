package Ex3;

public class RMain {
    public static void main(String[] args) {
          HangHoa ok=new HangHoa("a112", "keo bac ha",3000, 5);
          HangHoa ok2=new HangHoa();
          ok2.setMaHang("b567");
          ok2.setTenHang("banh trung thu");
          ok2.setSoLuoong(3);
          ok2.setDonGia(20000);
        System.out.println("===MAT HANG 1====");
        ok.Xuat();
        System.out.println("===MAT HANG 2====");
        ok2.Xuat();

    }
}
