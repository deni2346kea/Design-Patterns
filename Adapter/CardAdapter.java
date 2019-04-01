package Adapter;

public class CardAdapter implements CardReader {

    AdvancedCardReader advancedCardReader;

    public CardAdapter(String cardType){

        if(cardType.equalsIgnoreCase("Mastercard") ){
            advancedCardReader = new Mastercard();

        }else if (cardType.equalsIgnoreCase("VISA")){
            advancedCardReader = new VISA();
        }
    }

    @Override
    public void read(String cardType, String fileName) {

        if(cardType.equalsIgnoreCase("Mastercard")){
            advancedCardReader.readVISA(fileName);
        }
        else if(cardType.equalsIgnoreCase("VISA")){
            advancedCardReader.readMastercard(fileName);
        }
    }
}
