package view;

import javax.swing.*;
import java.awt.*;

public class MyCaculator extends JFrame {
    public MyCaculator(){
        this.setTitle("My Caculator");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextField
        JTextField jTextField = new JTextField();
        // JPanel là 1 thùng chứa các layout nhỏ hơn :(
        JPanel jPanel_head = new JPanel();  //khởi tạo jPanel
        jPanel_head.setLayout(new BorderLayout()); // set layout cho phần header
        jPanel_head.add(jTextField, BorderLayout.CENTER); // căn giữa


        // JButton
        JButton jButton0 = new JButton("0");
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");
        JButton jButtonCong = new JButton("+");
        JButton jButtonTru = new JButton("-");
        JButton jButtonNhan = new JButton("*");
        JButton jButtonChia = new JButton("/");
        JButton jButtonBang = new JButton("=");

        //khởi tạo jPanel
        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(5, 3)); // set layout cho phần body
        jPanel_button.add(jButton0);
        jPanel_button.add(jButton1);
        jPanel_button.add(jButton2);
        jPanel_button.add(jButton3);
        jPanel_button.add(jButton4);
        jPanel_button.add(jButton5);
        jPanel_button.add(jButton6);
        jPanel_button.add(jButton7);
        jPanel_button.add(jButton8);
        jPanel_button.add(jButton9);
        jPanel_button.add(jButtonCong);
        jPanel_button.add(jButtonTru);
        jPanel_button.add(jButtonNhan);
        jPanel_button.add(jButtonChia);
        jPanel_button.add(jButtonBang);

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_button, BorderLayout.CENTER);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Look an Fell ==> đổi giao diện
        try {
//           UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  // nên dùng vì nó phù hợp với máy tính
            new MyCaculator();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
