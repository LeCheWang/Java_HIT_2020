package View;
import Controler.Controler;
import KhachHang.KhachAnTaiCho;
import KhachHang.KhachMuaVe;
import KhachHang.KhachOrder;
import Nguoi.DauBep;
import Nguoi.PhucVu;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String DauBepFile ="daubep.txt";
        String PhucVuFile ="phucvu.txt";
        String KhachAnTaiChoFile="khachantaicho.txt";
        String KhachMuaVeFile="khachmuave.txt";
        String KhachOrderFile ="khachorder.txt";
        Controler controler=new Controler();
        ArrayList<KhachAnTaiCho> khachAnTaiChos = controler.CreateKhachAnTaiChoFromData(KhachAnTaiChoFile);
        ArrayList<KhachMuaVe> khachMuaVes = (ArrayList<KhachMuaVe>) controler.CreateKhachMuaVeFromData(KhachMuaVeFile);
        ArrayList<KhachOrder> khachOrders = controler.CreateKhachOrderFromData(KhachOrderFile);
        ArrayList<DauBep> dauBeps = controler.CreateDauBepFromData(DauBepFile);
        ArrayList<PhucVu> phucVus = controler.CreatePhucVuFromData(PhucVuFile);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====================MENU===================");
            System.out.println("======NHAN VIÊN======");
            System.out.print("1. Thêm Nhân Viên Phục Vụ");
            System.out.print("\t\t2. Hiển Thị Danh sách nhân viên");
            System.out.print("\t\t3. Sửa danh sách nhân viên");
            System.out.println("\t\t4. Xóa nhân viên\n");
            System.out.println("======ĐẦU BẾP========");
            System.out.print("5. Thêm Đầu Bếp");
            System.out.print("\t\t6. Hiển Thị Danh Sách Đầu Bếp");
            System.out.print("\t\t7. Sửa Danh Sách đầu bếp");
            System.out.println("\t\t8. Xóa Đầu Bếp\n");
            System.out.println("=======KHACH HÀNG========");
            System.out.print("9. Thêm Lịch Sử Khách Hàng Ăn Tại Chỗ");
            System.out.println("\t\t10. Hiển Thị Lịch Sử Khách Hàng Ăn Tại Chỗ");
            System.out.print("11. Thêm Lịch Sử Khách hàng Mua Về");
            System.out.println("\t\t\t12. Hiển Thị Lịch Sử Khách hàng mua về");
            System.out.print("13. Thêm Lịch Sử Khách Hàng Order");
            System.out.println("\t\t\t14. Hiển Thị Lịch Sử Khách Hàng Order");
            System.out.print("Your Choose: ");
            choice=sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1: //add phục vụ
                    String ID, name, gender, caLam, viTri;
                    int age, soNgayLamViec, soNgayNghi;
                    System.out.println("Nhập Mã Nhân Viên: ");
                    ID = sc.nextLine();
                    System.out.println("Nhập Tên Nhân Viên: ");
                    name = sc.nextLine();
                    System.out.println("Nhập Tuổi: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Giới Tính: ");
                    gender = sc.nextLine();
                    System.out.println("Nhập Ca Làm: ");
                    caLam = sc.nextLine();
                    System.out.println("Nhập Vị Trí: ");
                    viTri = sc.nextLine();
                    System.out.println("Nhập Số Ngày Làm Việc");
                    soNgayLamViec = sc.nextInt();
                    System.out.println("Nhập Số Ngày Nghỉ: ");
                    soNgayNghi = sc.nextInt();
                    PhucVu phucVu = new PhucVu(ID, name, gender, age, soNgayLamViec, caLam, viTri, soNgayNghi);
                    controler.WritePhucVuToFile(PhucVuFile, phucVu);
                    break;
                case 2: //show phục vụ
                    phucVus = controler.CreatePhucVuFromData(PhucVuFile);
                    System.out.println("==================DANH SÁCH PHỤC VỤ==============");
                    System.out.printf("%-20s%-20s%-10s%-10s%-10s%-15s%-20s%-20s\n", "Ma NV", "Tên", "GioiTinh", "Tuổi", "SoNgayLam", "Ca Lam", "Vị Trí", "SO Ngay Nghỉ");
                    for (PhucVu a : phucVus) {
                        a.Output();
                    }
                    break;
                case 3: //edit nhân viên
                    String id;
                    boolean check = false;
                    System.out.print("Nhập Mã Nhân Viên Cần chỉnh Sửa: ");
                    id = sc.nextLine();
                    for (int i = 0; i < phucVus.size(); i++) {
                        if (phucVus.get(i).getMaNhanVien().compareToIgnoreCase(id) == 0) {
                            check = true;
                            System.out.println("Sửa Tên: ");
                            phucVus.get(i).setName(sc.nextLine());
                            System.out.println("Sửa tuổi: ");
                            phucVus.get(i).setAge(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Sửa giới tính: ");
                            phucVus.get(i).setGender(sc.nextLine());
                            System.out.println("Sửa Ca làm: ");
                            phucVus.get(i).setCaLam(sc.nextLine());
                            System.out.println("Sửa vị trí: ");
                            phucVus.get(i).setViTri(sc.nextLine());
                            System.out.println("Sửa số ngày làm: ");
                            phucVus.get(i).setNgayLamViec(sc.nextInt());
                            System.out.println("Sửa số ngày nghỉ: ");
                            phucVus.get(i).setSoNgayNghi(sc.nextInt());
                            sc.nextLine();
                        }
                    }
                    controler.UpdatePhucVuToFile(phucVus, PhucVuFile);
                    if (check == false) System.out.println("MÃ NHÂN VIÊN KHÔNG TỒN TẠI");
                    else System.out.println("ĐÃ CHỈNH SỬA");
                    break;
                case 4: // xóa nhân viên
                    String iD;
                    boolean checkID = false;
                    System.out.print("Nhập Mã Nhân Viên Cần Xóa: ");
                    iD = sc.nextLine();
                    for (int i = 0; i < phucVus.size(); i++) {
                        if (phucVus.get(i).getMaNhanVien().compareToIgnoreCase(iD) == 0) {
                            phucVus.remove(i);
                            checkID = true;
                        }
                    }
                    controler.UpdatePhucVuToFile(phucVus, PhucVuFile);
                    if (checkID == false) System.out.println("MÃ NHÂN VIÊN KHÔNG TỒN TẠI");
                    else System.out.println("ĐÃ XÓA");
                    break;
                case 5: //thêm đầu bếp
                    String iddb, namedb, gd, vt;
                    int agedb, kn, nlv;
                    System.out.println("Nhập mã đầu bếp: "); iddb=sc.nextLine();
                    System.out.println("Nhập Tên đầu bếp: "); namedb=sc.nextLine();
                    System.out.println("Nhập giới tính: "); gd=sc.nextLine();
                    System.out.println("Nhập tuổi: "); agedb=sc.nextInt();
                    System.out.println("Nhập số ngày làm việc: "); nlv=sc.nextInt(); sc.nextLine();
                    System.out.println("Nhập vị trí: ");  vt=sc.nextLine();
                    System.out.println("Nhập số năm kinh nghiệm: "); kn=sc.nextInt();
                    DauBep d=new DauBep(iddb, namedb, gd, agedb, nlv, vt, kn);
                    controler.WriteDauBepToFile(DauBepFile, d);
                    break;
                case 6: // show đầu bếp
                    dauBeps = controler.CreateDauBepFromData(DauBepFile);
                    System.out.println("=============DANH SÁCH ĐẦU BẾP=================");
                    System.out.printf("%-20s%-20s%-15s%-10s%-20s%-20s%-20s\n", "MÃ NHÂN VIÊN", "NAME", "GENDER", "AGE", "Số Ngày Làm", "Vị Trí", "Kinh Nghiệm");
                    for (DauBep a: dauBeps ) {
                        a.Output();
                    }
                    break;
                case 7: //sửa đầu bếp
                    check=false;
                    System.out.print("Nhập Mã Nhân Viên Cần chỉnh Sửa: ");
                    id = sc.nextLine();
                    for (int i = 0; i < dauBeps.size(); i++) {
                        if (dauBeps.get(i).getMaNhanVien().compareToIgnoreCase(id) == 0) {
                            check = true;
                            System.out.println("Sửa Tên: ");
                            dauBeps.get(i).setName(sc.nextLine());
                            System.out.println("Sửa giới tính: ");
                            dauBeps.get(i).setGender(sc.nextLine());
                            System.out.println("Sửa tuổi: ");
                            dauBeps.get(i).setAge(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Sửa Số Ngày làm việc: ");
                            dauBeps.get(i).setNgayLamViec(sc.nextInt());
                            System.out.println("Sửa vị trí: ");
                            dauBeps.get(i).setViTri(sc.nextLine());
                            System.out.println("Sửa số Năm kinh nghiệm: ");
                            dauBeps.get(i).setNamKn(sc.nextInt());
                            sc.nextLine();
                        }
                    }
                    controler.UpdateDauBepToFile(dauBeps, DauBepFile);
                    if (check == false) System.out.println("MÃ ĐẦU BẾP KHÔNG TỒN TẠI");
                    else System.out.println("ĐÃ CHỈNH SỬA");
                    break;

                case 8:// xáo đầu bếp
                    boolean checkI = false;
                    String iDD;
                    System.out.print("Nhập Mã Đầu Bếp Cần Xóa: ");
                    iDD = sc.nextLine();
                    for (int i = 0; i < dauBeps.size(); i++) {
                        if (dauBeps.get(i).getMaNhanVien().compareToIgnoreCase(iDD) == 0) {
                            dauBeps.remove(i);
                            checkI = true;
                        }
                    }
                    controler.UpdateDauBepToFile(dauBeps, DauBepFile);
                    if (checkI == false) System.out.println("MÃ ĐẦU BẾP KHÔNG TỒN TẠI");
                    else System.out.println("ĐÃ XÓA");
                    break;
                case 9: // thêm khách ăn tại nhà hàng
                    int ban;
                    System.out.println("Nhập ID khách hàng: ");
                    ID=sc.nextLine();
                    System.out.println("Nhập Tên khách hàng: ");
                    name=sc.nextLine();
                    System.out.println("Nhập số bàn: ");
                    ban=sc.nextInt(); sc.nextLine();
                    KhachAnTaiCho khachAnTaiCho =new KhachAnTaiCho(ID, name, ban);
                    controler.WriteKhachAnTaiChoToFile(KhachAnTaiChoFile, khachAnTaiCho);
                    break;
                case 10: // hiển thị lịch sử khách hàng ăn tại nhà hàng
                    khachAnTaiChos = controler.CreateKhachAnTaiChoFromData(KhachAnTaiChoFile);
                    System.out.println("========KHACH ĂN TẠI NHÀ HÀNG=========");
                    System.out.printf("%-20s%-20s%-20s\n", "ID Khach", "Tên Khách", "Số Bàn");
                    for (KhachAnTaiCho a: khachAnTaiChos) {
                        a.Output();
                    }
                    break;
                case 11: //thêm lịch sử khách mua về
                    int soMon;
                    System.out.println("Nhập ID khách: "); ID=sc.nextLine();
                    System.out.println("Nhập tên khách: "); name=sc.nextLine();
                    System.out.println("Nhập số món ăn: "); soMon=sc.nextInt(); sc.nextLine();
                    KhachMuaVe khachMuaVe=new KhachMuaVe(ID, name, soMon);
                    controler.WriteKhachMuaVeToFile(KhachMuaVeFile, khachMuaVe);
                    break;
                case 12://showw khách mua về
                    System.out.println("=========KHACH MUA VỀ============");
                    khachMuaVes=controler.CreateKhachMuaVeFromData(KhachMuaVeFile);
                    System.out.printf("%-20s%-20s%-20s\n", "ID Khách", "Tên Khach", "Số Món");
                    for (KhachMuaVe muaVe: khachMuaVes) {
                        muaVe.Output();
                    }
                    break;
                case 13://thêm lịch sử khách Order
                    String sdt, dc;
                    System.out.println("Nhập ID khách: "); ID=sc.nextLine();
                    System.out.println("Nhập Tên khách: "); name=sc.nextLine();
                    System.out.println("Nhập số điện thoại: "); sdt=sc.nextLine();
                    System.out.println("Nhập địa chỉ: ");   dc=sc.nextLine();
                    KhachOrder khachOrder=new KhachOrder(ID, name, sdt, dc);
                    controler.WriteKhachOrderToFile(KhachOrderFile, khachOrder);
                    break;

                case 14://show lịch sử khách order
                    System.out.println("============KHACH ORDER============");
                    khachOrders = controler.CreateKhachOrderFromData(KhachOrderFile);
                    System.out.printf("%-20s%-20s%-20s%-20s\n", "ID khach", "Tên Khach", "Số ĐT", "Địa Chỉ");
                    for (KhachOrder k: khachOrders ) {
                        k.Outpu();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("++++++***** Lựa chọn không hợp lệ");
            }

        }while (choice!=0);

    }

    //method static




}
