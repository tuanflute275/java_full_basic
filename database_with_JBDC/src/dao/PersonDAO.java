package dao;

import model.Person;

import java.util.ArrayList;

public class PersonDAO implements DAOInterface<Person>{
    public static PersonDAO getInstance(){
        return new PersonDAO();
    }
    @Override
    public int insert(Person person) {
        return 0;
    }

    @Override
    public int update(Person person) {
        return 0;
    }

    @Override
    public int delete(Person person) {
        return 0;
    }

    @Override
    public ArrayList<Person> selectAll() {
        return null;
    }

    @Override
    public Person selectById(Person person) {
        return null;
    }

    @Override
    public ArrayList<Person> selectByCondition(String condition) {
        return null;
    }
}
