package ThreadsClass;

public class Client {
    static void doSomething(){
        System.out.println("Thread name here is :- " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Thread name is :- " + Thread.currentThread().getName());
        //System.out.println("Hello");
        //doSomething();

        //System.out.println("Hello World");

        PrintSomething task1 = new PrintSomething("Hello World");
        //task1.run();

        Thread t1 = new Thread(task1);
        t1.start();

        PrintSomething task2 = new PrintSomething("Umang");
        Thread t2 = new Thread(task1);
        t2.start();

        //Print numbers from 1 to 100 using 100 different threads


        for(int i = 1 ; i <= 100000 ; i++){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
}
/*
Auto save
Auto suggestion
Spell checker

are all of them happening?
 */