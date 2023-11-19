
public class Main {
    public static void main(String[] args) {
        // Cat
        Cat c = new Cat();
        System.out.println(c.getName());
        c.eat();
        c.makeSound();

        System.out.println("--------------");

        // Bird
        Bird b = new Bird();
        System.out.println(b.getName());
        b.eat();
        b.makeSound();
    }
}