package view;

import javax.swing.*;
import java.awt.FlowLayout;

public class example_FlowLayout extends JFrame {
    public example_FlowLayout(){
        this.setTitle("FlowLayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); // căn giữa màn hình

        // set layout
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 50, 50);
        this.setLayout(flowLayout);

        JButton button_1 = new JButton("ok");
        JButton button_2 = new JButton("cancel");

        // add thành phần vào layout
        this.add(button_1);
        this.add(button_2);

        // đóng chương trình khi close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new example_FlowLayout();
    }
}
