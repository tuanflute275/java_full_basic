package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ghiDuLieuVoiVanBan {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\thongtin","UTF-8");
            pw.println("hello tuannfluteeee27555");
            pw.println(" live in hanoi");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
