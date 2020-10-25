package BTVN_day5.Ex2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc p1=new SoPhuc();
        SoPhuc p2=new SoPhuc();
        System.out.println("====NHAP SO PHUC 1====");
        p1.Nhap();
        System.out.println("====NHAP SO PHUC 2=====");
        p2.Nhap();
        System.out.println("==========HAI SO PHUC VU NHAP==========");
        p1.Xuat();
        p2.Xuat();
        System.out.println("=======TONG HAI SO PHUC========");
        SoPhuc sum;
        sum=p1.Cong(p2);
        sum.Xuat();
        System.out.println("=======HIEU HAI SO PHUC========");
        SoPhuc tru;
        tru=p1.Tru(p2);
        tru.Xuat();
    }
}
