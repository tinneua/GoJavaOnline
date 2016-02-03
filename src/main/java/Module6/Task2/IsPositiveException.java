package Module6.Task2;

public class IsPositiveException extends Exception {
    private int enteredValue;
    public IsPositiveException (int enteredValue) {
        this.enteredValue = enteredValue;
    }

    public int getEnteredValue() {
        return enteredValue;
    }
}
