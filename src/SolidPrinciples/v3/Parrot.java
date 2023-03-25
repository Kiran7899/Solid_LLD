package SolidPrinciples.v3;

public class Parrot extends Bird implements IFlyable, IEater {

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }
}
