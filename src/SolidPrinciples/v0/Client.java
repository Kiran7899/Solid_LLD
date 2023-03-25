package SolidPrinciples.v0;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.Breed = "Crow";
        b1.age = 10;
        b1.weight = 30;

        b1.eat();
        b1.fly();

        Bird b2 = new Bird();
        b2.Breed = "Parrot";
        b2.age = 10;
        b2.weight = 30;

        b2.eat();
        b2.fly();
    }
}
