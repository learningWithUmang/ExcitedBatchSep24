package AdderSubtractorMutex;

import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Count count;
    Lock lock;

    Subtractor(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 1000 ; i++){
            lock.lock();
            count.value -= i;
            lock.unlock();
        }
        return null;
    }
}
