package Adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        DankortReader dankortReader = new DankortReader();

        dankortReader.read("Dankort", " Authentication ----> **** **** **** 3453, success, Dankort");
        dankortReader.read("Mastercard", " Authentication ----> **** **** **** 7651, success, Mastercard");
        dankortReader.read("VISA", "Authentication ----> **** **** **** 9438, success, VISA");
        dankortReader.read("Rejsekort ", "failed");
    }
}
