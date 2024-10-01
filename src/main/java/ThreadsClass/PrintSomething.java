package ThreadsClass;

public class PrintSomething implements Runnable{
    String strToPrint;

    PrintSomething(String str){
        this.strToPrint = str;
    }

    @Override
    public void run() {
        System.out.println("Thread inside task is :- " + Thread.currentThread().getName());
        System.out.println(strToPrint);
    }
}
