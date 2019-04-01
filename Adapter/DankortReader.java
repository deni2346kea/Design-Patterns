package Adapter;

public class DankortReader implements CardReader {
    CardAdapter cardAdapter;

    @Override
    public void read(String cardType, String fileName) {


        if(cardType.equalsIgnoreCase("Dankort")){
            System.out.println("Reading Dnakort card. Name: " + fileName);
        }

        //DankortReader is providing support to read other cards formats
        else if(cardType.equalsIgnoreCase("VISA") || cardType.equalsIgnoreCase("Mastercard")){
            cardAdapter = new CardAdapter(cardType);
            cardAdapter.read(cardType, fileName);
        }

        else{
            System.out.println("Invalid Card. " + cardType + ", format not supported");
        }
    }
}