package MergeSortMultiThreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> ls = List.of(2,1,6,7,8,21,13,23,1231,3,2,3,2,2,3,4,5,43,2,4,13,10,9);
        ExecutorService ex = Executors.newCachedThreadPool();

        Sorter task = new Sorter(ls, ex);


        Future<List<Integer>> finalFuture = ex.submit(task);

        ls = finalFuture.get();

        System.out.println(ls);

    }
}
