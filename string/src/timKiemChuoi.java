public class timKiemChuoi {
    public static void main(String[] args) {
        String s1 = "tuanflute275";
        String s2 = "275";
        char c1 = 'f';

        // hàm indexOf()  ==> tìm kiếm
        System.out.println(s1.indexOf(s2));

        // sử dụng vị trí bắt đầu
        System.out.println(s1.indexOf(s2, 2));

        // tìm kiếm char
        System.out.println(s1.indexOf(c1));
        System.out.println(s1.indexOf(c1, 2));


        // hàm lastIndexOf()  => tìm kiếm từ phải qua trái
        System.out.println(s1.lastIndexOf(s2));
    }
}
