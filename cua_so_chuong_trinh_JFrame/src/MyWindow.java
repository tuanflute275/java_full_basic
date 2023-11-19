import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showIt(String title, int width, int height, int x, int y){
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocation(x, y);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow m = new MyWindow();
        m.showIt("My app", 600, 400, 500, 200);
    }
}
