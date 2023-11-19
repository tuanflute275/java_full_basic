import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 9;
        TinhToan t = new TinhToan(10, 5);

        System.out.println("number a is: "+t.getNumberA());
        t.setNumberA(27.5f);
        System.out.println("number a is: "+t.getNumberA());
        t.setNumberB(12.5f);
        System.out.println("number b is: "+t.getNumberB());

        System.out.println("Tong hai so la: "+t.TinhTong());
        System.out.println("Hieu hai so la: "+t.TinhHieu());
        System.out.println("Tich hai so la: "+t.TinhTich());
        System.out.println("Thuong hai so la: "+t.TinhThuong());

        System.out.println("Chu vi HCN la: "+t.chuViHcn());
        System.out.println("Dien tich HCN la: "+t.DienTichHcn());
    }
}