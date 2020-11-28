
public class RunMain {
    public static void main(String[] args) {
        Giamdoc gd =new Giamdoc("Hà Văn Phòng", "Nam", 19, "0337733234");
        gd.titel();
        gd.Output();
        QuanLi ql=new QuanLi("Phương Saphirea", "nam", 19, "0337733234", 18, "HaNoi");
       ql.title();
        ql.Output();
//        NhanVien nv=new NhanVien("Lich", "nam", 19, "Nv1", "Bếp", "12/11/2020");
//        nv.title();

        DauBep db=new DauBep();
        db.Input();
        db.title();
        db.Output();

    }
}
