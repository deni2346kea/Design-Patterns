package Decorator;

public class Cab implements Vehicle {

    @Override
    public void bill() {
        System.out.println("Vehicle: Cab");
    }
}
