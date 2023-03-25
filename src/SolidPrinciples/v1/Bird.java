package SolidPrinciples.v1;

public abstract class Bird {
    String name;
    int age;
    float weight;

    public void fly(){
        System.out.println(name + " is flying.!");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

}
