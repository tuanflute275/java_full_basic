package dao;

import database.JDBCUtil;
import model.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO implements DAOInterface<Book>{
    public static BookDAO getInstance(){
        return new BookDAO();
    }
    @Override
    public int insert(Book book) {
        int ketQua = 0;
       try {
           // bước 1 : tạo kết nối
           Connection connection = JDBCUtil.getConnection();

           //bước 2: tạo ra đối tượng statement
           Statement st = connection.createStatement();

           //bước 3: thực thi câu lệnh
           String sql = "INSERT INTO `book`(`id`, `name`, `price`, `publishing_year`)"
                   +"VALUES"
                   +"('"+book.getId()+"' , '"+book.getName()+"', '"+book.getPrice()+"', '"+book.getPublishing_year()+"')";

           ketQua = st.executeUpdate(sql);

           // bước 4 : xử lí dữ liệu
           System.out.println("Bạn đã thực thi sql: "+sql);
           System.out.println("có "+ketQua+" dòng bị thay đổi!");

           //bước 5: ngắt kết nối
           JDBCUtil.closeConnection(connection);

       }catch (SQLException e){
           e.printStackTrace();
       }
        return 0;
    }

    @Override
    public int update(Book book) {
        return 0;
    }

    @Override
    public int delete(Book book) {
        return 0;
    }

    @Override
    public ArrayList<Book> selectAll() {
        return null;
    }

    @Override
    public Book selectById(Book book) {
        return null;
    }

    @Override
    public ArrayList<Book> selectByCondition(String condition) {
        return null;
    }
}
