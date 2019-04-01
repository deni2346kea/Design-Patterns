package Decorator;

public class Uber implements Vehicle {

    @Override
    public void bill() {
        System.out.println("Vehicle: Uber");
    }
}