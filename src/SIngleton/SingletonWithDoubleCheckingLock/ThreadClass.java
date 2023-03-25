package SIngleton.SingletonWithDoubleCheckingLock;

public class ThreadClass implements Runnable {

    @Override
    public void run() {
        Printer.GetInstance();
    }
}
