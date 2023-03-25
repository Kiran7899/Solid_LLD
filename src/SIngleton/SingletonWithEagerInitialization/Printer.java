package SIngleton.SingletonWithEagerInitialization;

public class Printer {
    int count = 0;
    private static Printer _instance = new Printer();
    private Printer(){
        count++;
        System.out.println("Printer object is created");
    }

    public static Printer GetInstance(){

        return _instance;
    }
}
