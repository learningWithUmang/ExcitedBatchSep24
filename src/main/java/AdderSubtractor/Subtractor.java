package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Count count;

    Subtractor(Count count){
        this.count = count;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 1000 ; i++){
            count.value -= i;
        }
        return null;
    }
}
