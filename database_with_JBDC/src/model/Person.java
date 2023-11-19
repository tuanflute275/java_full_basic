package model;

import java.sql.Date;

public class Person {
    private int id;
    private String name;

    private Date date_of_birth;
    private String address;

    public Person() {
    }

    public Person(int id, String name, Date date_of_birth, String address) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
