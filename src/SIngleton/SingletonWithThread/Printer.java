package SIngleton.SingletonWithThread;

import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    int count = 0;
    private static Printer _instance;
    static ReentrantLock lock = new ReentrantLock();
    private Printer(){
        count++;
        System.out.println("Printer object is created");
    }

    //Lock using Synchronized Keyword
    public static synchronized Printer GetInstance(){

        if(_instance == null)
        {
            _instance = new Printer();
        }
        return _instance;
    }

    //Lock Using lock keyword
    public static Printer GetInstance1() {

            if (_instance == null) {
                if (lock.tryLock()) {
                    _instance = new Printer();
                }
            }
            return _instance;
    }
}

