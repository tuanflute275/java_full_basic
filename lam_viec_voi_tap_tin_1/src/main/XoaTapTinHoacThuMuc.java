package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class XoaTapTinHoacThuMuc {

    public static void xoaFile(File fx){
        if(fx.isFile()){
            // xóa nếu là tập tin
            System.out.println("Đã xóa "+fx.getAbsolutePath());
            fx.delete();
        } else if (fx.isDirectory()) {
            // lấy các file con
            File[] mangCon = fx.listFiles();
            for (File f: mangCon) {
                // xóa các file con
                xoaFile(f);
            }
            // xóa bản thân thư mục sau khi đã xóa các file con
            System.out.println("Đã xóa "+fx.getAbsolutePath());
            fx.delete();
        }
    }


    public static void main(String[] args) {
        File fvd1 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\vidu1.txt");
        File f0 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1");
        File fvd_2 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1\\vidu2.txt");
        File f2 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1\\Directory_2");
        File f3 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1\\Directory_2\\Directory_3");


        // sử dụng class File
        //f3.deleteOnExit();  // xóa được vì là thư mục rỗng   => không trả ra kết quả gì
        // f3.delete();  => hàm delete() trả về giá trị true or false , nếu xóa dc thì trả về true nếu k xóa dc sẽ trả về false
        // XoaTapTinHoacThuMuc.xoaFile(f2);



//        fvd3.delete();
//    hoặc
//        sử dụng class Files
//        try {
//            Files.deleteIfExists(f3.toPath());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



    }
}
