package Executors;

public class PrintNumber implements Runnable {
    int noToPrint;

    PrintNumber(int noToPrint){
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println("Thread printing " + noToPrint + " is + " + Thread.currentThread().getName());
        //System.out.println(noToPrint);
    }
}
