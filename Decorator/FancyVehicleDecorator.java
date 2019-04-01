package Decorator;

public class FancyVehicleDecorator extends VehicleDecorator {

    public FancyVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void bill() {
        decoratedVehicle.bill();
        setAperitif(decoratedVehicle);
    }

    private void setAperitif(Vehicle decoratedVehicle){
        System.out.println("Aperitif was added to your bill: Whisky  2.5 oz");
    }
}
