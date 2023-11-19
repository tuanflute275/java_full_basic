package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DoiTenDiChuyenVaCopy {

    public static void copyAll(File f1, File f2){
        try {
            //copy bản thân nó
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }

        if(f1.isDirectory()){
            // copy các tập tin và thư mục
            File[] mangCon = f1.listFiles();
            for(File file: mangCon){
                File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
                copyAll(file, file_new);
            }
        }
    }


    public static void main(String[] args) {
        File f0 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\vidu1R.txt");
        File f1 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\vidu1.txt");
        File f2 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\vidu.txt");


        //1. thay đổi tên tập tin hoặc thư mục
        // sử dụng File để thay đổi tên
//        f0.renameTo(f1);

        // sử dụng Files để thay đổi tên
//        try {
//            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



        // 2.di chuyển file
//        File f2_new = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1\\vidu.txt");
//        try {
//            Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



        // 3.copy file
        File f_0 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1");
        File f_0_copy = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\Directory_1_copy");
//        try {
//            Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        DoiTenDiChuyenVaCopy.copyAll(f_0, f_0_copy);
    }
}
