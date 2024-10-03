package AdderSubtractorSyncMethods;

public class Count {
    int value = 0;

    public synchronized void incrementCountByX(int x){
        this.value += x;
    }

    public synchronized void decrementCountByX(int x){
        this.value -= x;
    }
}
