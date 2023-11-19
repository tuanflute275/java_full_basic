package dao;

import database.JDBCUtil;
import model.Book;
import model.Person;

import java.sql.*;
import java.util.ArrayList;

public class PersonDAO implements DAOInterface<Person>{
    public static PersonDAO getInstance(){
        return new PersonDAO();
    }
    @Override
    public int insert(Person person) {
        int ketQua = 0;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            String sql = "INSERT INTO `client`(`id`, `name`, `date_of_birth`, `address`)"
                    +"VALUES (?, ?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, person.getId());
            pst.setString(2, person.getName());
            pst.setDate(3, person.getDate_of_birth());
            pst.setString(4, person.getAddress());

            //bước 3: thực thi câu lệnh insert data

            ketQua = pst.executeUpdate();

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
    public int update(Person person) {
        int ketQua = 0;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            String sql = "UPDATE `client` "+
                    "SET "+
                    "`name`=?" +
                    ", `date_of_birth`=?" +
                    ", `address`=?" +
                    " WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,person.getName());
            pst.setDate(2,person.getDate_of_birth());
            pst.setString(3,person.getAddress());
            pst.setInt(4,person.getId());

            //bước 3: thực thi câu lệnh update data


            System.out.println(sql);

            ketQua = pst.executeUpdate();

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
    public int delete(Person person) {
        int ketQua = 0;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            String sql = "DELETE FROM `client` WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,person.getId());

            //bước 3: thực thi câu lệnh insert data
            ketQua = pst.executeUpdate();

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
    public ArrayList<Person> selectAll() {
        ArrayList<Person> ketQua = new ArrayList<Person>();
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            String sql = "SELECT * FROM client";
            PreparedStatement pst = connection.prepareStatement(sql);

            //bước 3: thực thi câu lệnh insert data
            // ResultSet là 1 table mà  mình có thể lấy từng dòng ra
            ResultSet rs = pst.executeQuery();

            // bước 4 : xử lí dữ liệu
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Date date_of_birth = rs.getDate("date_of_birth");
                String address = rs.getString("address");

                Person person = new Person(id, name, date_of_birth, address);
                ketQua.add(person);
            }

            //bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Person selectById(Person person) {
        Person ketQua = null;
        try {
            // bước 1 : tạo kết nối
            Connection connection = JDBCUtil.getConnection();

            //bước 2: tạo ra đối tượng statement
            String sql = "SELECT * FROM client WHERE id = ?";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,person.getId());

            //bước 3: thực thi câu lệnh insert data
            // ResultSet là 1 table mà  mình có thể lấy từng dòng ra
            System.out.println(sql);
            ResultSet rs = pst.executeQuery(sql);

            // bước 4 : xử lí dữ liệu
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Date date_of_birth = rs.getDate("date_of_birth");
                String address = rs.getString("address");

                ketQua = new Person(id, name, date_of_birth, address);
            }

            //bước 5: ngắt kết nối
            JDBCUtil.closeConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Person> selectByCondition(String condition) {
        return null;
    }
}
