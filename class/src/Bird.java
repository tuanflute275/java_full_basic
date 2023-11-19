public class Bird extends Animal{
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("I eat deep");
    }

    @Override
    public void makeSound() {
        System.out.println("bird bird");
    }
}
