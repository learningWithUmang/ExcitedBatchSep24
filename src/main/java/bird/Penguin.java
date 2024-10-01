package bird;

public class Penguin extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
