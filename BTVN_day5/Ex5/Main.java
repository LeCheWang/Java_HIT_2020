package BTVN_day5.Ex5;

public class Main {
    public static void main(String[] args) {
        LopHoc lh=new LopHoc();
        lh.Input();
        System.out.println("============================THONG TIN LOP HOC==================================");
        lh.Output();
        System.out.println("SO SV K14: "+ lh.CountK14());
        lh.Sort();
        System.out.println("=======================THONG TIN LOP HOC DA SAP XEP============================");
        lh.Output();
    }
}
