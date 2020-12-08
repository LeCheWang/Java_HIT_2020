package Nguoi;

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

    }
    @Override
    public void Output() {
        super.Output();
        System.out.printf("%-20s%-20d\n", viTri, namKn);

    }
    public long Luong(){
        if (viTri.compareToIgnoreCase("BEP TRUONG")==0 )
            return 30000000*getNgayLamViec()/26;
        else return 7000000*getNgayLamViec()/26;
    }

    public DauBep(String maNhanVien, String name, String gender, int age, int ngayLamViec, String viTri, int namKn) {
        super(maNhanVien, name, gender, age, ngayLamViec);
        this.viTri = viTri;
        this.namKn = namKn;
    }

    public DauBep(String maNhanVien, int ngayLamViec, String viTri, int namKn) {
        super(maNhanVien, ngayLamViec);
        this.viTri = viTri;
        this.namKn = namKn;
    }

    public DauBep(String viTri, int namKn) {
        this.viTri = viTri;
        this.namKn = namKn;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getNamKn() {
        return namKn;
    }

    public void setNamKn(int namKn) {
        this.namKn = namKn;
    }
}
