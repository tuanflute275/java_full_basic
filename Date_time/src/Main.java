import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // System.currentTimeMillis() lấy ra số mili giây hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy for: "+t1);
        System.out.println("Sau khi chạy for: "+t2);
        System.out.println("Thời gian: "+(t2-t1)+"mls");
        System.out.println("Thời gian: "+(t2-t1)/1000+"s");

        // TimeUnit  => chuyển đổi kiểu (từ giờ sang phút, phút sang giờ, giây sang phút...)
        System.out.println("25h = "+ TimeUnit.HOURS.toSeconds(25)+" s");
        System.out.println("3000 năm = "+TimeUnit.DAYS.toDays(3000*365)+" ngày");


        //Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d);
        System.out.println("ngày hiện tại là: "+d.getDate());
        System.out.println("tháng hiện tại là: "+(d.getMonth()+1));
        System.out.println("năm hiện tại là: "+(d.getYear()+1900));


        // calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + (calendar.get(Calendar.MONTH )+1));
        System.out.println("DAY: " + calendar.get(Calendar.DATE));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));

        // add thêm
        calendar.add(Calendar.YEAR, 2);
        calendar.add(Calendar.YEAR, -1);
        System.out.println("1 nam sau: " + calendar.get(calendar.YEAR));


        //phương thức getTime()
        //System.out.print("Date And Time: " + calendar.getTime());



        //Date Format
        DateFormat df = new SimpleDateFormat();
        System.out.println("date format: "+df.format(d));

        // format theo ý của mình
        // yyyy -> năm
        // MM -> tháng
        // dd ->ngày
        //H -> giờ
        // m -> phút
        // s -> giây
        df = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        System.out.println("date format: "+df.format(d));
    }

}