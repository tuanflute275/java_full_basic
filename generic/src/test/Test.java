package test;

import main.Box;


public class Test {
    public static void main(String[] args) {
        Box b1 = new Box<Integer>(27);
        System.out.println(b1);
        Box b2 = new Box<String>("nguyen van a");
        System.out.println(b2);

    }
}
