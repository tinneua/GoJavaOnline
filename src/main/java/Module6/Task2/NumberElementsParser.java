package Module6.Task2;


public class NumberElementsParser {
    public static int parseNumber(String number) throws InvalidElementsException {
        int numberElementsInt = Integer.parseInt(number);
        if (numberElementsInt <= 0 || numberElementsInt > 100) {
            throw new InvalidElementsException(numberElementsInt);
        }
        return numberElementsInt;
    }

}