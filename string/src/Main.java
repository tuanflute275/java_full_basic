import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("---------------");

        // hàm length()  =>  lấy độ dài của chuỗi
        int doDai = s.length();
        System.out.println(doDai);

        // hàm charAt(viTri) ==> lấy ra 1 kí tự tại vị trí
        for (int i = 0; i < doDai; i++) {
            System.out.println("vị trí: "+i+"là: "+s.charAt(i));
        }

        // hàm getChars(vị trí bắt đầu, vị trí kết thúc,
        // mảng lưu trữ dữ liệu, vị trí bắt đầu cảu mảng)
        // ít dùng
        char[] arrChar = new char[100];
        s.getChars(0, 3, arrChar, 0);
        for (int i = 0; i < arrChar.length; i++) {
            System.out.println("giá trị của mảng tại: "+i+"là: "+arrChar[i]);
        }


        //hàm getBytes() ==> có 3 cách, lấy ra giá trị của các kí tự
        byte[] arrBytes = s.getBytes();
        for (int i = 0; i < arrBytes.length; i++) {
            System.out.println("giá trị của kí tự : "+i+" là: "+arrBytes[i]);
        }

    }
}