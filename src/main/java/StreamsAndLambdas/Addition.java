package StreamsAndLambdas;

public class Addition implements ArithmeticOperation{
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
