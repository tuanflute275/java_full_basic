import java.text.NumberFormat; // format number
import java.util.Locale; // lấy vi trí của quốc gia
import java.util.Random; // lấy ngẫu nhiên
import java.util.Scanner; // nhập dữ liệu

public class Main {
    public static void main(String[] args) {
        String username = "tuanflute275";
        String password = "111111";
        int choice;
        long amount;
        boolean isLogin = false;
        double player_account = 10000;
        Scanner sc = new Scanner(System.in);



        Locale lc = new Locale("vi", "VN"); // định dạng quốc gia vi => vietNam
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);  // format số theo Locale

        do {
            System.out.println("                                    ");
            System.out.println("======== Mời bạn lựa chọn ==========");
            System.out.println("1. Đăng nhập");
            System.out.println("2. kiểm tra tài khoản");
            System.out.println("3. Nạp tiền");
            System.out.println("4. chơi game tài xỉu");
            System.out.println("Chọn số 0 để thoát chương trình");
            System.out.println("Xin mời bạn chọn: ");
            choice = sc.nextInt();
            switch ( choice ) {
                case 0:
                    System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi <3");
                    break;
                case  1:
                    if (isLogin){
                        System.out.println("Bạn đã đăng nhập vào tài khoản");
                    }else {
                        System.out.println("Vui long nhập username của bạn: ");
                        String userName = sc.next();
                        System.out.println("Vui long nhập mật khẩu của bạn: ");
                        String userPassword = sc.next();
                        if(userPassword.compareTo(password) == 0 && userName.compareTo(username) == 0){
                            isLogin = true;
                            System.out.println("Bạn đã đăng nhập vào tài khoản");
                        }else {
                            System.out.println("userName hoặc password không đúng !");
                        }
                    }
                    break;
                case  2:
                    if(isLogin){
                        System.out.println("Tài khoản của bạn hiện có: "+numf.format(player_account));
                    }else {
                        System.out.println("Vui lòng đăng nhập để thực hiện giao dịch này !");
                    }
                    break;
                case 3:
                   if(isLogin){
                       System.out.println("Nhập số tiền muốn nạp vào tài khoản: ");
                       amount = sc.nextLong();
                       if(amount > 0){
                           player_account += amount;
                           System.out.println("Nạp Tiền vào Tài khoản Thành công !");
                       }else{
                           System.out.println("Số tiền cần nạp không hợp lệ, Vui lòng kiểm tra lại !");
                       }
                   }else{
                       System.out.println("Vui lòng đăng nhập để thực hiện giao dịch này !");
                   }
                    break;
                case  4:
                    if(isLogin){
                        System.out.println("***** Bắt đầu trò chơi *****");
                        System.out.println("Tài khoản của bạn hiện có là: "+numf.format(player_account));

                        if(player_account == 0){
                            System.out.println("Tài khoản không đủ, Vui lòng nạp thêm tiền để tiếp tục trò chơi !");
                        }else{
                            double datCuoc = 0;

                            // đặt cược số tiền
                            do {
                                System.out.println("Đặt cược (0 < số tiền cược <= "+numf.format(player_account)+" )");
                                datCuoc = sc.nextDouble();
                            }while (datCuoc <= 0 || datCuoc>player_account);


                            // lựa chọn tài hoặc xỉu
                            int luaChonTaiXiu = 0;
                            do {
                                System.out.println("*** Chọn 1 <-> Tài hoặc 2 <-> Xỉu  ***");
                                luaChonTaiXiu = sc.nextInt();
                            }while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);


                            // Tung xúc xắc
                            Random xucxac = new Random();
                            int giaTri1 = xucxac.nextInt(5)+1;
                            int giaTri2 = xucxac.nextInt(5)+1;
                            int giaTri3 = xucxac.nextInt(5)+1;
                            int tong = giaTri1+giaTri2+giaTri3;

                            // tính toán kết quả
                            System.out.println("**** Kết quả: "+giaTri1+" - "+giaTri2+" - "+giaTri3+" ****");
                            // in ra kết quả là tài hay xỉu
                            if(tong >=4 && tong <= 11){
                                System.out.println("======> Xỉu <======");
                            }else {
                                System.out.println("======> Tài <======");
                            }

                            // tiến hành so sánh kết quả và cộng, trừ tiền
                            if(tong == 3 || tong == 18){
                                player_account -= datCuoc;
                                System.out.println("Nhà cái thắng, bạn đã thua :(((");
                                System.out.println("===> Tài khoản của bạn hiện có là: "+numf.format(player_account));
                            } else if (tong >=4 && tong <=11) {
                                if (luaChonTaiXiu == 2) {
                                    System.out.println("Bạn đã thắng cược!");
                                    player_account += datCuoc;
                                    System.out.println("===> Tài khoản của bạn hiện có là: "+numf.format(player_account));
                                }else {
                                    System.out.println("Bạn đã thua cược!");
                                    player_account -= datCuoc;
                                    System.out.println("===> Tài khoản của bạn hiện có là: "+numf.format(player_account));
                                }
                            }else{
                                if (luaChonTaiXiu == 1) {
                                    System.out.println("Bạn đã thắng cược!");
                                    player_account += datCuoc;
                                    System.out.println("===> Tài khoản của bạn hiện có là: "+numf.format(player_account));
                                }else {
                                    System.out.println("Bạn đã thua cược!");
                                    player_account -= datCuoc;
                                    System.out.println("===> Tài khoản của bạn hiện có là: "+numf.format(player_account));
                                }
                            }
                        }
                    }else{
                        System.out.println("Vui lòng đăng nhập để thực hiện giao dịch này !");
                    }

                    break;
                default:
                    System.out.println("Sai định dạng vui lòng nhập lại !!!");
            }
        }while (choice != 0);
    }
}