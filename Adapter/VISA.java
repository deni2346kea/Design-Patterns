package Adapter;

public class VISA implements AdvancedCardReader {

    @Override
    public void readVISA(String fileName) {
        //do nothing
    }

    @Override
    public void readMastercard(String fileName) {
        System.out.println("Reading Visa card. Name: "+ fileName);
    }
}