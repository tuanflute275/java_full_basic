package test;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t1 = new ThoiKhoaBieu(Day.Monday, "Toán Lý Hóa");
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Văn Sử Địa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Monday, "Lý Hóa Sinh");
        System.out.println(tkb_t1.toString());
    }
}
