package test;

import dao.BookDAO;
import model.Book;

public class TestBookDAO {
    public static void main(String[] args) {
        Book book1 = new Book(2, "chi pheo", 1244, 2011);
//        BookDAO.getInstance().insert(book2);
        System.out.println(book1);
    }
}
