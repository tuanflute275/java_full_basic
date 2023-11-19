package view;

import javax.swing.*;
import java.awt.*;

public class example_BorderLayout extends JFrame {
    public example_BorderLayout(){
        this.setTitle("FlowLayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); // căn giữa màn hình

        // set layout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout1 = new BorderLayout(20, 20);
        this.setLayout(borderLayout1);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");


        // add thành phần vào layout
        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.SOUTH);
        this.add(button3, BorderLayout.WEST);
        this.add(button4, BorderLayout.EAST);
        this.add(button5, BorderLayout.CENTER);


        // đóng chương trình khi close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new example_BorderLayout();
    }
}
