package SolidPrinciples.v0;

public class Bird {
    String Breed;
    float weight;
    int age;

    public void fly() {
        if (Breed == "Crow")
            System.out.println(Breed + " is flying.");
        else if (Breed == "Parrot") {
            System.out.println("Piegeon is flying");
        } else {
            System.out.println("Bird is flying");
        }
    }

        public void eat() {
            if (Breed == "Crow")
                System.out.println(Breed + " is eating.");
            else if (Breed == "Parrot") {
                System.out.println("Piegeon is eating");
            } else {
                System.out.println("Bird is eating");
            }
        }
    }

