package dao;

import database.JDBCUtil;
import model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
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

            //bước 3: thực thi câu lệnh insert data
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
        return ketQua;
    }

    @Override
    public int update(Book book) {
        int ketQua = 0;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            Statement st = connection.createStatement();

            //bước 3: thực thi câu lệnh update data

            String sql = "UPDATE `book` "+
                         "SET "+
                         "`name`='"+book.getName()+"'" +
                         ", `price`="+book.getPrice()+
                         ", `publishing_year`="+book.getPublishing_year()+
                         " WHERE id = "+book.getId()+"";
            ketQua = st.executeUpdate(sql);

            // bước 4 : xử lí dữ liệu
            System.out.println("Bạn đã thực thi sql: "+sql);
            System.out.println("có "+ketQua+" dòng bị thay đổi!");

            //bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Book book) {
        int ketQua = 0;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            Statement st = connection.createStatement();

            //bước 3: thực thi câu lệnh insert data
            String sql = "DELETE FROM `book` WHERE id = "+book.getId()+"";

            ketQua = st.executeUpdate(sql);

            // bước 4 : xử lí dữ liệu
            System.out.println("Bạn đã thực thi sql: "+sql);

            //bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Book> selectAll() {
        ArrayList<Book> ketQua = new ArrayList<Book>();
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            Statement st = connection.createStatement();

            //bước 3: thực thi câu lệnh insert data
            String sql = "SELECT * FROM book";


            // ResultSet là 1 table mà  mình có thể lấy từng dòng ra
            ResultSet rs = st.executeQuery(sql);

            // bước 4 : xử lí dữ liệu
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Float price = rs.getFloat("price");
                int publishing_year = rs.getInt("publishing_year");

                Book book = new Book(id, name, price, publishing_year);
                ketQua.add(book);
            }

            //bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Book selectById(Book book) {
        Book ketQua = null;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            Statement st = connection.createStatement();

            //bước 3: thực thi câu lệnh insert data
            String sql = "SELECT * FROM book WHERE id = "+book.getId()+"";


            // ResultSet là 1 table mà  mình có thể lấy từng dòng ra
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            // bước 4 : xử lí dữ liệu
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Float price = rs.getFloat("price");
                int publishing_year = rs.getInt("publishing_year");

                ketQua = new Book(id, name, price, publishing_year);
            }

            //bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Book> selectByCondition(String condition) {
        return null;
    }
}
