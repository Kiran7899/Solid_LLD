package SIngleton;

public class Printer {
    int count = 0;
    private static Printer _instance;
    private Printer(){
        count++;
        System.out.println("Printer object is created");
    }

    public static Printer GetInstance(){
        if(_instance == null)
        {
            _instance = new Printer();
        }
        return _instance;
    }
}
