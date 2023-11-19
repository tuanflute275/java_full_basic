package main;

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
}
