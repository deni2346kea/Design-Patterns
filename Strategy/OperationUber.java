package Strategy;

public class OperationUber implements Strategy{
    @Override
    public double calculatePrice(double num1, double num2) {
        return num1 * num2 - 20;
    }
}
