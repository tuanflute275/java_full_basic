package view;

import javax.swing.*;
import java.awt.*;

public class example_GridLayout extends JFrame {
    public example_GridLayout(){
        this.setTitle("GridLayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); // căn giữa màn hình

        // set layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout2 = new GridLayout(4, 4);
        GridLayout gridLayout3 = new GridLayout(4,4,10, 10);

        this.setLayout(gridLayout3);

        for (int i = 0; i < 16; i++) {
            JButton jButton = new JButton(i+"");
            this.add(jButton);
        }

        // đóng chương trình khi close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new example_GridLayout();
    }
}
