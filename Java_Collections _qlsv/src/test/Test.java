package test;

import main.DanhSachSinhVien;
import main.SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        do {
            System.out.println("                                    ");
            System.out.println("======== MENU ==========");
            System.out.println("1. Thêm sinh viên.");
            System.out.println("2. In danh sách sinh viên.");
            System.out.println("3. Lấy ra số lượng sinh viên trong danh sách.");
            System.out.println("4. Kiểm tra danh sách có rỗng hay không ?");
            System.out.println("5. Xóa tất cả danh sách sinh viên.");
            System.out.println("6. Kiểm tra sinh viên có tồn tại hay không dựa trên mã sinh viên ?");
            System.out.println("7. Xóa 1 sinh viên khỏi danh sách dựa trên mã sinh viên.");
            System.out.println("8. Tìm kiếm tất cả sinh viên dưa trên Tên được nhập từ bàn phím ");
            System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. ");
            System.out.println("0. Kiểm tra danh sách có rỗng hay không ?");
            System.out.println("Chọn số 0 để thoát chương trình.");
            System.out.println("Xin mời bạn chọn: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch ( luaChon ) {
                case 0:
                    System.out.println("Thank You <3");
                    break;
                case  1:
                    // Thêm sinh viên
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.println("Nhập điểm trung bình: ");
                    float diemTrungBinh = sc.nextFloat();

                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case  2:
                    // In danh sách sinh viên.
                    dssv.inDanhSachSinhVien();
                    break;
                case  3:
                    // Lấy ra số lượng sinh viên trong danh sách
                    System.out.println("Danh sách rỗng: "+dssv.soLuongSinhVien());
                    break;
                case  4:
                    // Kiểm tra danh sách có rỗng hay không ?
                    System.out.println("Danh sách rỗng: "+dssv.kiemTraDanhSachRong());
                    break;
                case  5:
                    // Xóa tất cả danh sách sinh viên.
                    dssv.lamRongDanhSach();
                    break;
                case  6:
                    // Kiểm tra sinh viên có tồn tại hay không dựa trên mã sinh viên ?
                    System.out.println("Nhập mã sinh viên: ");
                    String maSV = sc.nextLine();
                    SinhVien s = new SinhVien(maSV);
                    System.out.println("Kiểm tra sinh viên có trong danh sách: "+dssv.kiemTraTonTai(s));
                    break;
                case  7:
                    // Xóa 1 sinh viên khỏi danh sách dựa trên mã sinh viên.
                    System.out.println("Nhập mã sinh viên: ");
                    String maS = sc.nextLine();
                    SinhVien sv1 = new SinhVien(maS);
                    dssv.xoaSinhVien(sv1);
                    break;
                case  8:
                    // Tìm kiếm tất cả sinh viên dưa trên Tên được nhập từ bàn phím
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTenn = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    dssv.timKiem(hoVaTenn);
                    break;
                case  9:
                    // Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.inDanhSachSinhVien();
                    break;
                default:
                    System.out.println("Sai định dạn, vui lòng nhập lại !");
            }
        }while (luaChon != 0);
    }
}
