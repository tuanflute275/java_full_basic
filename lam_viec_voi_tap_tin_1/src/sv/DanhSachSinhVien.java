package sv;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    // private ArrayList<SinhVien (genneric?)> danhSach;

    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // add() => thêm mới
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien(){
        for (SinhVien sinhvien: danhSach) {
            System.out.println(sinhvien);
        }
    }

    //isEmpty() => kiểm tra có rỗng hay không
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }

    //size() => lấy ra kích cỡ,độ dài
    public int soLuongSinhVien(){
        return this.danhSach.size();
    }

    // removeAll() => xóa tất cả
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    // contains() tìm kiếm sinh viên sử dụng arrayList
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    // remove() xóa sinh viên sử dụng arrayList
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }

    // indexOf => tìm kiếm và trả về số
    public void timKiem(String ten){
        for (SinhVien sinhvien: danhSach) {
            if(sinhvien.getHoVaTen().indexOf(ten)>=0){
                System.out.println(sinhvien);
            }
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return 1;
                }else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

    public void ghiDuLieuXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for(SinhVien sinhVien: danhSach){
                oos.writeObject(sinhVien);
            }

            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docDuLieuXuongFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = null;
            while (true){
                Object oj = ois.readObject();
                if(oj==null){
                    break;
                }
                if(oj!=null){
                    sv = (SinhVien) oj;
                    this.danhSach.add(sv);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
