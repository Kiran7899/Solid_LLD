package SIngleton.SingletonWithThread;

public class ThreadClass implements Runnable{
    @Override
    public void run() {
        Printer.GetInstance1();
    }
}
