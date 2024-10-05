package ProducerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

/*
Java classes - 4
1st  is on Collections interface
data structures - thread safe / concurrent
 */
public class Store {
    private int maxSize; //no of shelf in the store, isin't fixed?
    private ConcurrentLinkedDeque<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        //5 consumers are allowed here
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove(); //0 items
    }
}