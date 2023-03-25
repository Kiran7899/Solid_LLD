package SIngleton;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            Printer.GetInstance();
        }
        //Printer.GetInstance();
    }

}
