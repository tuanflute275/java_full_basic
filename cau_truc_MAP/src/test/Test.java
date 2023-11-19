package test;

import main.TuDien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("                                    ");
            System.out.println("======== MENU ==========");
            System.out.println("1. Thêm từ.");
            System.out.println("2. Xóa từ.");
            System.out.println("3. Tìm ý nghĩa của từ khóa => tra từ.");
            System.out.println("4. In ra danh sách từ khóa.");
            System.out.println("5. In ra số lượng từ");
            System.out.println("6. Xóa tất cả từ.");
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
                    // Thêm từ
                    System.out.println("Nhập từ khóa: ");
                    String tuKhoa = sc.nextLine();
                    System.out.println("Nhập ý nghĩa: ");
                    String yNghia = sc.nextLine();
                    tuDien.themTu(tuKhoa, yNghia);
                    break;
                case  2:
                    // xóa từ
                    System.out.println("Nhập từ khóa: ");
                    String tuKhoa1 = sc.nextLine();
                    tuDien.xoaTu(tuKhoa1);
                    break;
                case  3:
                    // Tìm ý nghĩa của từ khóa
                    System.out.println("Nhập từ khóa: ");
                    String tuKhoa2 = sc.nextLine();
                    System.out.println("Ý nghĩa là: "+tuDien.traTu(tuKhoa2));
                    break;
                case  4:
                    // In ra danh sách từ khóa.
                    tuDien.inTuKhoa();
                    break;
                case  5:
                    // In ra số lượng từ
                    System.out.println("Số lượng từ khóa là: "+ tuDien.laySoLuong());
                    break;
                case  6:
                    // xóa tất cả
                    tuDien.xoaTatCa();
                    break;
                default:
                    System.out.println("Sai định dạn, vui lòng nhập lại !");
            }
        }while (luaChon != 0);
    }
}
