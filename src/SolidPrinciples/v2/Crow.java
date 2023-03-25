package SolidPrinciples.v2;

public class Crow extends Bird implements IFlyable,IEater{

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }
}
