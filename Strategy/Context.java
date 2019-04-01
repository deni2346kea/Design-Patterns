package Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(double num1, int num2){
        return strategy.calculatePrice(num1, num2);
    }
}
