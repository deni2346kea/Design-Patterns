package Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {

        Vehicle LAX_Cab = new Cab();

        Vehicle luxuryCab = new FancyVehicleDecorator(new Cab());

        Vehicle onlyPorscheUber = new FancyVehicleDecorator(new Uber());


        System.out.println("Billing information - LAX_CAB");
        LAX_Cab.bill();

        System.out.println("\nBilling information - Luxury Cabs LA");
        luxuryCab.bill();

        System.out.println("\nBilling information - Only Porsche Bus group");
        onlyPorscheUber.bill();
    }
}