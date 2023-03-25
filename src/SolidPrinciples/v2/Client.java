package SolidPrinciples.v2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<IFlyable> birds = new ArrayList<IFlyable>();
        IFlyable b1 = new Crow();
        IFlyable b2 = new Parrot();
        birds.add(b1);
        birds.add(b2);
        //birds.add((IFlyable) new Penguin());

        List<IEater> eatingBirds = new ArrayList<>();
        eatingBirds.add(new Penguin());
        Parrot parrot = new Parrot();
        parrot.name = "Kiran";
        parrot.fly();

        for (int i=0;i<birds.size();i++) {
            birds.get(i).fly();
        }
    }
}
