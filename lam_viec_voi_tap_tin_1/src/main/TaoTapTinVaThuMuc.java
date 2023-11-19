package main;

import java.io.File;
import java.io.IOException;

public class TaoTapTinVaThuMuc {
    // https://docs.oracle.com/javase/8/docs/api/java/io/File.html
    public static void main(String[] args) {
        // lưu ý: Window: \ => \\  ví dụ: "C:\\thumuc1\tentaptin.txt"
        //        Linux, MacOs: /   ví dụ: "C:/thumuc1/tentaptin.txt"


        // kiểm tra thư mục hoặc tập tin có tồn tại hay không
        File folder1 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1");
        File folder2 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test");

        System.out.println("kiểm tra xem folder1 có tồn tại hay không ==> "+folder1.exists());  // true
        System.out.println("kiểm tra xem folder2 có tồn tại hay không ==> "+folder2.exists());  // false


        // tạo thư mục
        // phương thức mkdir()   => tạo 1 thư mục
        File d1 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test");
        d1.mkdir();

        // phương thức mkdirs()   => tạo nhiều thư mục cùng 1 lúc
        File d2 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1\\Directory_2\\Directory_3");
        d2.mkdirs();


        // tạo tập tin có phần mở rộng (.exe, .txt , .doc, .....)
        File file1 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1\\vidu2.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // khong có quyền tạo tập tin
            // ổ cứng bị đầy
            // đường dẫn sai ...
            throw new RuntimeException(e);
        }

    }
}
