package SIngleton.SingletonWithThread;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++) {
            Thread thread = new Thread(new ThreadClass());
            thread.start();
        }
        //Printer.GetInstance();
    }

}
