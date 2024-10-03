package AdderSubtractorSyncMethods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();

        Adder task1 = new Adder(count);
        Subtractor task2 = new Subtractor(count);

        ExecutorService ex = Executors.newCachedThreadPool();



        Future<Void> res1 = ex.submit(task1);
        Future<Void> res2 = ex.submit(task2);

        res1.get();
        res2.get();

        System.out.println(count.value);
    }
}
