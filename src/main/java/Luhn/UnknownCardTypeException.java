package Luhn;


public class UnknownCardTypeException extends Exception{
    private String card;
    private String prefixCard;
    public UnknownCardTypeException(final String card,final String prefixCard) {
        this.card = card;
        this.prefixCard = prefixCard;
        System.out.println("[ERROR]Entered card is Unknown Type!");
        System.out.println("Card length: " + getCard());
        System.out.println("Entered prefix is: " + getPrefixCard());
    }
    public String getPrefixCard() {
        return prefixCard;
    }

    public int getCard() {
        return card.length();
    }
}
