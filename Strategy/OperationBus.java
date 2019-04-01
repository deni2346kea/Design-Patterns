package Strategy;

public class OperationBus implements Strategy{
    @Override
    public double calculatePrice(double num1, double num2) {
        return num1 * num2 * 1.1;
    }
}
