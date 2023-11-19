package main;

import sv.SinhVien;

import java.io.*;

public class DocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = (SinhVien) ois.readObject();
            System.out.println(sv);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
