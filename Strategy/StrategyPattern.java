package Strategy;

public class StrategyPattern {
    public static void main(String[] args) {


        Context context = new Context(new OperationUber());
        System.out.println("Estimated price for Uber: " + context.executeStrategy(23, 3)+"$");

        context = new Context(new OperationBus());
        System.out.println("Estimated price for BUS: " + context.executeStrategy(23, 1)+"$");

        context = new Context(new OperationCab());
        System.out.println("Estimated price for CAB LAX: " + context.executeStrategy(23, 6)+"$");
    }
}