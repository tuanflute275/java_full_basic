package model;

public class Book {
    private int id;
    private String name;
    private  float price;
    private int publishing_year;

    public Book() {
    }

    public Book(int id, String name, float price, int publishing_year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publishing_year = publishing_year;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPublishing_year() {
        return publishing_year;
    }

    public void setPublishing_year(int publishing_year) {
        this.publishing_year = publishing_year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publishing_year=" + publishing_year +
                '}';
    }
}
