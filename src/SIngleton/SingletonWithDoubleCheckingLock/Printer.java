package SIngleton.SingletonWithDoubleCheckingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
    int count = 0;

    static Lock lock = new ReentrantLock();
    private static Printer _instance;
    private Printer(){
        count++;
        System.out.println("Printer object is created");
    }

    public static Printer GetInstance(){

        if(_instance == null) {
                    lock.lock();
                    if(_instance == null)
                        _instance = new Printer();
                    lock.unlock();
                }
        return _instance;
        }


    }

