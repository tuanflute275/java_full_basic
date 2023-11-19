package main;

import java.io.File;
import java.util.Scanner;

public class LayThongTinVaDuyetThuMuc {
    File file;

    public LayThongTinVaDuyetThuMuc(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi() {
        //kiểm tra file có thể thực thi
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        //kiểm tra file có thể đọc
        return this.file.canRead();
    }

    public boolean kiemTraGhi() {
        //kiểm tra file có thể ghi
        return this.file.canWrite();
    }

    public void inDuongDan() {
        //in ra đường dẫn
        System.out.println(this.file.getAbsoluteFile());
    }

    public void inTen() {
        //in ra tên
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucHayTapTin() {
        //kiểm tra là thư mục hay tập tin
        if(this.file.isDirectory()){
            System.out.println("Đây là thư mục !");
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin !");
        }
    }


    public void inDanhSachCacFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Các tập tin con/thư mục con là: ");
            File[] mangcon = this.file.listFiles();
            for (File file: mangcon) {
                System.out.println(file.getAbsoluteFile());
            }
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin, không có dữ liệu con bên trong !");
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        System.out.println("Nhập tên file: ");
        String tenFile = sc.nextLine();
        LayThongTinVaDuyetThuMuc viduFile = new LayThongTinVaDuyetThuMuc(tenFile);
        do {
            System.out.println("          ");
            System.out.println("---Menu---");
            System.out.println("1. kiểm tra file có thể được thực thi ");
            System.out.println("2. kiểm tra file có thể đọc ");
            System.out.println("3. kiểm tra file có thể ghi ");
            System.out.println("4. In đường dẫn ");
            System.out.println("5. In tên file ");
            System.out.println("6. kiểm tra file là thư mục hoặc tập tin ");
            System.out.println("7. In danh sách các file con ");
            System.out.println("0. Thoát chương trình ");
            luachon = sc.nextInt();

            switch (luachon) {
                case 0:
                    System.out.println("Thank you <3");
                    break;
                case 1:
                    if (viduFile.kiemTraThucThi()){
                        System.out.println("có thể thực thi file này !");
                    }else {
                        System.out.println("không thể thực thi file này !");
                    }
                    break;
                case 2:
                    if (viduFile.kiemTraDoc()){
                        System.out.println("có thể đọc file này !");
                    }else {
                        System.out.println("không thể đọc file này !");
                    }
                    break;
                case 3:
                    if (viduFile.kiemTraGhi()){
                        System.out.println("có thể ghi file này !");
                    }else {
                        System.out.println("không thể ghi file này !");
                    }
                    break;
                case 4:
                    viduFile.inDuongDan();
                    break;
                case 5:
                    viduFile.inTen();
                    break;
                case 6:
                    viduFile.kiemTraLaThuMucHayTapTin();
                    break;
                case 7:
                    viduFile.inDanhSachCacFileCon();
                    break;
            }

            sc.nextLine();
        }while (luachon != 0);
    }
}
