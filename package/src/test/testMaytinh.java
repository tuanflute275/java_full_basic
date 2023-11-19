package test;

import code.MaytinhFx500;

public class testMaytinh {
    public static void main(String[] args) {
        MaytinhFx500 mfx500 = new MaytinhFx500();
        System.out.println("27 + 5  = " + mfx500.cong(27, 5));
        System.out.println("27 - 5  = " + mfx500.tru(27, 5));
        System.out.println("27 x 5  = " + mfx500.nhan(27, 5));
        System.out.println("27 / 5  = " + mfx500.chia(27, 5));
    }
}
