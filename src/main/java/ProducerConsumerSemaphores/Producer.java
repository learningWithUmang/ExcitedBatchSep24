package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    Semaphore prodSema;
    Semaphore consSema;
    Producer(Store st, Semaphore prodSema, Semaphore consSema) {
        this.store = st;
        this.consSema = consSema;
        this.prodSema = prodSema;
    }
    @Override
    public void run() {
        while(true) {
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSema.release();
        }
    }
}