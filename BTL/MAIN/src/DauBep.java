public class DauBep extends NhanVien{
    private String viTri;
    private int namKn;


    @Override
    public void Input() {
        super.Input();
        System.out.println("Nhập vị trí làm việc: ");
        viTri=sc.nextLine();
        System.out.println("Nhập số năm kinh nghiệm: ");
        namKn=sc.nextInt();
    }
    public void title(){
        System.out.printf("%-20s%-20s%-15s%-10s%-20s%-20s%-20s%-20s\n", "MÃ NHÂN VIÊN", "NAME", "GENDER", "AGE", "BỘ PHẬN", "LÀM VIỆC TỪ(ngày)", "Vị Trí", "Kinh Nghiệm");
    }
    @Override
    public void Output() {
        super.Output();
        System.out.printf("%-20s%-20d\n", viTri, namKn);

    }
    public long Luong(){
        long luong=0;
        if (viTri.compareTo("BEP TRUONG")==0 )
            return 30000000*getNgayLamViec()/26;
        else return 7000000*getNgayLamViec()/26;
    }
}
