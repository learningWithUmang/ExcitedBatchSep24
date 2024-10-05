package ProducerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);

        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);

        //8 producer
        for(int i = 1; i<=100; ++i){
            Producer task = new Producer(store, prodSema, consSema);
            ex.execute(task);
        }
        //20 consumers
        for(int i = 1 ; i <=2; ++i){
            Consumer task = new Consumer(store, prodSema, consSema);
            ex.execute(task);
        }
    }

}
/*
0 items
18 producers, 18 consumers
as soon as producer is producing, consumer is consuming
5 items are produced, consumer is consuming immediately
more than 2-3 items
 */