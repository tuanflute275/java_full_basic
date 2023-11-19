public class soSanhChuoi {
    public static void main(String[] args) {
        String s1 = "tuanflute275";
        String s2 = "TuanFlute275";
        String s3 = "tuanflute275";

        // hàm equals  => so sánh 2 chuỗi giống nhau CÓ phân biệt hoa thường
        System.out.println("s1 so sanh voi s2: "+ s1.equals(s2));
        System.out.println("s1 so sanh voi s3: "+s1.equals(s3));

        // hàm equalsIgnoreCase  => so sánh 2 chuỗi giống nhau KHÔNG phân biệt hoa thường
        System.out.println("s1 so sanh voi s2: "+ s1.equalsIgnoreCase(s2));
        System.out.println("s1 so sanh voi s3: "+s1.equalsIgnoreCase(s3));


        // hàm compareTo   => so sánh <, >, =
        // hàm này không trả về 1 giá trị nào cố định mà
        // nó trả vee3 3 kieeur như sau: số âm, số dương và số 0
        //ví dụ: System.out.println("sv1 comparreTo sv2: "+ sv1.compareTo(sv2));

        // số dương: thì sv1 lớn hơn sv2
        // số âm: thì sv1 nhỏ hơn sv2
        // số 0: là bằng nhau, giông nhau
        String sv1 = "nguyen van a";
        String sv2 = "nguyen van b";
        String sv3 = "nguyen van";
        System.out.println("sv1 comparreTo sv2: "+ sv1.compareTo(sv2));
        System.out.println("sv1 comparreTo sv3: "+ sv1.compareTo(sv3));


        // // hàm compareToIgnoreCase   => tương tự như  hàm compareTo ở trên nhưng mà không phân biệt hoa thuòng
        // hàm regionMatches()  ==> so sánh 1 đoạn
        // hàm startsWith() ==> hàm kiểm tra chuỗi bắt đầu bằng ...
        // hàm endsWith() ==> hàm kiểm tra chuỗi kết thúc bằng...
    }
}
