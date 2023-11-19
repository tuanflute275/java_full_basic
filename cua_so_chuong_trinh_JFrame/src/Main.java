import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame(); // khởi tạo đối tượng JFrame
        jf.setSize(600, 400); // set chiều rộng và chiều dài cho cửa soor ứng dụng
        jf.setTitle("Ung dung desktop"); // set tiêu đề cho ứng dụng
        jf.setLocation(500, 200); // cấu hình vị trí hiển thị của cửa sổ
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // thoát ra khỏi chương trình khi đóng cửa sổ
        jf.setVisible(true); // hiển thị cửa sổ ứng dụng
    }
}