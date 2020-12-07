package Controler;

import KhachHang.KhachAnTaiCho;
import KhachHang.KhachMuaVe;
import KhachHang.KhachOrder;
import Nguoi.DauBep;
import Nguoi.PhucVu;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controler {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void OpenFileToWrite(String fileName){
        try{
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void CloseFileAfterWriter(){
        try{
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void OpenFileToRead(String fileName){
        try{
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName),"UTF-8");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void CloseFileAfterRead(){
        try{
            scanner.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void WriteKhachAnTaiChoToFile(String fileName, KhachAnTaiCho khachAnTaiCho){
        OpenFileToWrite(fileName);
        printWriter.println(khachAnTaiCho.getIDKhach()+ "|"+ khachAnTaiCho.getTenKhach()+ "|"+ khachAnTaiCho.getSoBan());
        CloseFileAfterWriter();
    }
    public void WriteKhachMuaVeToFile(String fileName, KhachMuaVe khachMuaVe){
        OpenFileToWrite(fileName);
        printWriter.println(khachMuaVe.getIDKhach()+ "|"+ khachMuaVe.getTenKhach()+ "|"+ khachMuaVe.getSoMonAn());
        CloseFileAfterWriter();
    }
    public void WriteKhachOrderToFile(String fileName, KhachOrder khachOrder){
        OpenFileToWrite(fileName);
        printWriter.println(khachOrder.getIDKhach()+ "|"+ khachOrder.getTenKhach()+ "|"+ khachOrder.getSoDT()+"|"+khachOrder.getDiaChi());
        CloseFileAfterWriter();
    }
    public void WriteDauBepToFile (String fileName, DauBep dauBep){
        OpenFileToWrite(fileName);
        printWriter.println(dauBep.getName()+"|"+dauBep.getGender()+"|"+dauBep.getAge()+"|"+dauBep.getMaNhanVien()+"|"+dauBep.getNgayLamViec()+"|"+dauBep.getNamKn()+"|"+dauBep.getViTri());
        CloseFileAfterWriter();
    }
    public void WritePhucVuToFile (String fileName, PhucVu phucVu){
        OpenFileToWrite(fileName);
        printWriter.println(phucVu.getMaNhanVien()+"|"+phucVu.getNgayLamViec()+"|"+phucVu.getViTri()+"|"+phucVu.getCaLam()+"|"+phucVu.getSoNgayNghi());
        CloseFileAfterWriter();
    }
    public ArrayList<KhachAnTaiCho> CreateKhachAnTaiChoFromData(String fileName){
        OpenFileToRead(fileName);
        ArrayList<KhachAnTaiCho> listKhachAnTaiCho = new ArrayList<>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            String[] KhachStr = data.split("\\|");
            KhachAnTaiCho khachAnTaiCho = new KhachAnTaiCho(KhachStr[0],KhachStr[1],Integer.parseInt(KhachStr[2]));
            listKhachAnTaiCho.add(khachAnTaiCho);
        }
        CloseFileAfterRead();
        return listKhachAnTaiCho;
    }

    public ArrayList<KhachMuaVe> CreateKhachMuaVeFromData(String fileName){
        OpenFileToRead(fileName);
        ArrayList<KhachMuaVe> listKhachMuaVe = new ArrayList<>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            String [] KhachStr = data.split("\\|");
            KhachMuaVe khachMuaVe = new KhachMuaVe(KhachStr[0],KhachStr[1],Integer.parseInt(KhachStr[2]));
            listKhachMuaVe.add(khachMuaVe);
        }
        CloseFileAfterRead();
        return listKhachMuaVe;
    }

    public ArrayList<KhachOrder> CreateKhachOrderFromData(String fileName){
        OpenFileToRead(fileName);
        ArrayList<KhachOrder> listKhachOrder = new ArrayList<>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            String [] KhachStr = data.split("\\|");
            KhachOrder khachOrder = new KhachOrder(KhachStr[0],KhachStr[1],KhachStr[2], KhachStr[3]);
            listKhachOrder.add(khachOrder);
        }
        CloseFileAfterRead();
        return listKhachOrder;
    }


}
