package SolidPrinciples.v3;

public class Penguin extends Bird implements IEater {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}
