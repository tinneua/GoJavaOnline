package Luhn;

/**
Validate InputData:
 - if numbers enough to calculate checksum
 - whether it is AmEx, MasterCard or Visa
 @input
 */

public class InputData {
    String input;
    public void checkInput(String input) throws UnknownCardTypeException {
        this.input = input
                .replaceAll(" ","")
                .replaceAll("-","")
                .replaceAll("/","");

        if (input.length() == 15 && input.charAt(0) == 3 && (input.charAt(1) == 4 || input.charAt(1) == 7)) {
            System.out.println("American Express Card detected");
        } else if (input.length() == 16 && input.charAt(0) == 5 && (input.charAt(1) >= 1 && input.charAt(1) <= 5)) {
            System.out.println("MasterCard detected");
        } else if ((input.length() == 13 || input.length() == 16)  && input.charAt(0) == 4 ) {
            System.out.println("VISA Card detected");
        } else throw new UnknownCardTypeException(input,input.substring(0,2));
    }

    public String getInput() throws UnknownCardTypeException {
        checkInput(input);
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
