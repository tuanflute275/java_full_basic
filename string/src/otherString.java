public class otherString {
    public static void main(String[] args) {
        String s1 = "tuanflute";
        String s2 = "275";


        // hàm concat()   => dùng để nối chuỗi
        System.out.println(s1.concat(s2));

        // hàm replace()  => thay thế chuỗi
        System.out.println(s2.replace("275", "2705"));


        // hàm toLowerCase()  => chuyển về viết thường
        System.out.println(s1.toLowerCase());

        //toUpperCase() => chuyển về viết hoa
        System.out.println(s1.toUpperCase());

        // hàm trim()  => xóa khoảng trắng dư thừa đầu chuỗi
        String s3 = "   hi  ";
        System.out.println(s3.length());   // khong xóa khoảng trắng dư thừa đếm ra số lượng kí tự sai
        System.out.println(s3.trim().length()); // xóa khoảng trắng

        // hàm subString()
        String s4 = s1.substring(4);
        System.out.println(s4);
    }
}
