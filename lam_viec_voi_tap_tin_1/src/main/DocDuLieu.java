package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class DocDuLieu {
    public static void main(String[] args) {
      /*  Cách 1

      File f = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\thongtin");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true){
                line = br.readLine();
                if(line==null){
                    break;
                }else {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       */



        /* Cách 2  => file nhỏ còn file lớn từ vài chục mb thì lên chọn BufferedReader*/
        File f2 = new File("D:\\7-BACK-END\\Java\\Learn_java\\lam_viec_voi_tap_tin_1\\test\\thongtin");
        try {
            List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for(String line: allText){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
