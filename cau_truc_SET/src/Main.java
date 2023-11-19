import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int luaChon = 0;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("                                    ");
                System.out.println("======== MENU ==========");
                System.out.println("1. Thêm sinh viên.");
                System.out.println("2. In danh sách sinh viên.");
                System.out.println("3. Lấy ra số lượng sinh viên trong danh sách.");
                System.out.println("4. Kiểm tra danh sách có rỗng hay không ?");
                System.out.println("5. Xóa tất cả danh sách sinh viên.");
                System.out.println("6. Kiểm tra sinh viên có tồn tại hay không dựa trên mã sinh viên ?");
                System.out.println("7. Xóa 1 sinh viên khỏi danh sách dựa trên mã sinh viên.");
                System.out.println("8. Tìm kiếm tất cả sinh viên dưa trên Tên được nhập từ bàn phím ");
                System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. ");
                System.out.println("0. Kiểm tra danh sách có rỗng hay không ?");
                System.out.println("Chọn số 0 để thoát chương trình.");
                System.out.println("Xin mời bạn chọn: ");
                luaChon = sc.nextInt();
                sc.nextLine();
                switch ( luaChon ) {
                    case 0:
                        System.out.println("Thank You <3");
                        break;
                    case  1:

                        break;
                    case  2:

                        break;
                    case  3:

                        break;
                    case  4:

                        break;
                    case  5:

                        break;
                    case  6:

                        break;
                    case  7:

                        break;
                    case  8:

                        break;
                    case  9:

                        break;
                    default:
                        System.out.println("Sai định dạn, vui lòng nhập lại !");
                }
            }while (luaChon != 0);
        }
}