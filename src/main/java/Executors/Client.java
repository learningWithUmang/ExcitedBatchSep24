package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService ex1 = Executors.newFixedThreadPool(10);
        ExecutorService ex2 = Executors.newCachedThreadPool();

        //the cached thread pools creates new threads on demand
        //1 task - 1 thread
        //2 task - 2 thread
        //...

        for(int i = 1 ; i <= 100 ; i++){
            PrintNumber task = new PrintNumber(i);
            ex2.submit(task);
        }
    }
}
