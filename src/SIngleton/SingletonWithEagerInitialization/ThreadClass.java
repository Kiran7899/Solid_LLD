package SIngleton.SingletonWithEagerInitialization;

public class ThreadClass implements Runnable {

    @Override
    public void run() {
        Printer.GetInstance();
    }
}
