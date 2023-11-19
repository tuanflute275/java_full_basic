package main;

import sv.SinhVien;

import java.io.*;

public class LuuDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien("111", "nguyen van a", 2000, 8.9f);
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
