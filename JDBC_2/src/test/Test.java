package test;

import dao.BookDAO;
import dao.PersonDAO;
import model.Book;
import model.Person;

import java.sql.Date;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("hi");
        Book book1 = new Book(9, "chi pheo 9", 111, 222);
        Book book2 = new Book(3, "kkk", 123, 2010);
        String str1 = "1999-1-1";
        Date date1 = Date.valueOf(str1);
        Person ps1 = new Person(2,"Nguyễn Văn F", date1, "Hà Nội");

        /*
        *  không sử dụng statement vì k bảo mất hacker cs thể hack bằng cách như sau:
        * select * from client where id="a1" or 1=1 ;-- "
        *
        * */

        // test insert
//        BookDAO.getInstance().insert(book1);
//        PersonDAO.getInstance().insert(ps1);
//        ArrayList<Book> list = BookDAO.getInstance().selectAll();
//        for (Book book: list) {
//            System.out.println(book.toString());
//        }
        ArrayList<Person> listP = PersonDAO.getInstance().selectAll();
        for (Person person: listP) {
            System.out.println(person.toString());
        }

//        Book find = new Book();
//        find.setId(1);
//        Book book = BookDAO.getInstance().selectById(find);
//        System.out.println(book);
//
//        Person findP = new Person();
//        findP.setId(1);
//        Person personF = PersonDAO.getInstance().selectById(findP);
//        System.out.println(personF);

        //test update
//        BookDAO.getInstance().update(book1);
//        PersonDAO.getInstance().update(ps1);

        // test delete
//        BookDAO.getInstance().delete(book1);
//        PersonDAO.getInstance().delete(ps1);
    }
}
