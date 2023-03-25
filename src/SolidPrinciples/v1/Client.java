package SolidPrinciples.v1;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Crow();
        b1.name = "Crow";
        b1.fly();
        b1.eat();

        Bird b2 = new Parrot();
        b2.name = "Parrot";
        b2.fly();
        b2.eat();
    }
}
