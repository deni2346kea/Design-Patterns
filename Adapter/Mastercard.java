package Adapter;

public class Mastercard implements AdvancedCardReader {
    @Override
    public void readVISA(String fileName) {
        System.out.println("Reading Mastercard Name: "+ fileName);
    }

    @Override
    public void readMastercard(String fileName) {
        //do nothing
    }
}