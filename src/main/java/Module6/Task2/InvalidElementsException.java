package Module6.Task2;


public class InvalidElementsException extends Exception {
    private int numberElements;


    public InvalidElementsException(final int numberElements) {
        this.numberElements = numberElements;
    }
    public int getNumberElements() {
        return numberElements;
    }
}
